import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Netflix {
    public static int count = 0;
    public static void main(String []args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of records:");
        int n = sc.nextInt();
        List<NetflixMap> map = parseCsv();
        int option = 0;
        while(option!=-1){
            System.out.println("Please Enter any Operation or -1 to Exit"+'\n'+"1.Search by type."+'\n'+"2.Search by listed_in."+'\n'+"3.Search by type and country.");
            option=sc.nextInt();
            sc.nextLine();
            switch(option) {
                case 1:     System.out.println("Enter the type:");
                            String type = sc.nextLine();
                            getShowByCategory(map,type,n);
                            break;
                case 2:System.out.println("Enter the listed_in:");
                        String listed_in =sc.nextLine();
                        getShowByListedIn(map,listed_in,n);
                        break;
                case 3:System.out.println("Enter the type");
                     String type2 =sc.nextLine();
                    System.out.println("Enter the country");
                    String country = sc.nextLine();
                    getShowByTypeCountry(map,type2,country,n);
                    break;
                default: break;
            }
        }
    }

    public static List<NetflixMap> parseCsv() throws FileNotFoundException {
        List<NetflixMap> mapData = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("resources/netflix_titles.csv"))) {
            while (sc.hasNext())  //returns a boolean value
            {
                String data = sc.nextLine();
                //System.out.println(data);
                String[] fields = data.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                NetflixMap map = new NetflixMap(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], fields[8], fields[9], fields[10], fields[11]);
                mapData.add(map);
            }
        }
        return mapData;
    }

    public static void getShowByCategory(List<NetflixMap> mapData, String type, int n) {
        long start1 = System.nanoTime();
        List<NetflixMap> resultList = mapData.stream()
                .filter( map -> map.getType().equals(type))
                .limit(n)
                .collect(Collectors.toList());
        resultList.forEach( map -> System.out.println(map.toString()));
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));

    }

    public static void getShowByListedIn(List<NetflixMap> mapData, String listed_in, int n) {
        long start1 = System.nanoTime();
        List<NetflixMap> resultList = mapData.stream()
                .filter( map -> map.getListed_in().contains(listed_in))
                .limit(n)
                .collect(Collectors.toList());
        resultList.forEach( map -> System.out.println(map.toString()));
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
    }
    public static void getShowByTypeCountry(List<NetflixMap> mapData, String type,String country, int n) {
        long start1 = System.nanoTime();
        List<NetflixMap> resultList = mapData.stream()
                .filter( map -> map.getType().equals(type) && map.getCountry().equals(country))
                .limit(n)
                .collect(Collectors.toList());
        resultList.forEach( map -> System.out.println(map.toString()));
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
    }
}
