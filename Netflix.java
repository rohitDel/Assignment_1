import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Netflix {
    public static int count = 0;
    public static void main(String []args) throws FileNotFoundException {
        Integer n = Integer.parseInt(args[0]);
        parseCsv(n);
    }

    public static void parseCsv(Integer n) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/rohitgupta3/Downloads/netflix_titles.csv"));
        while (sc.hasNext() && count != n)  //returns a boolean value
        {
            String data = sc.nextLine();
            getShowByCategory(data, "TV Show");
        }
        sc.close();
    }

    public static void getShowByCategory(String input, String category) {
        String []fields = input.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//        String regex = ".*\\bs1\\b*.";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);

        String inputCategory = fields[1];
//        System.out.println(fields.length);
        if(inputCategory.equals(category)) {
            System.out.println(input);
            count++;
        }
    }
}
