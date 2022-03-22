public class NetflixMap {
    private String sNo;
    private String type;
    private String name;
    private String director;
    private String cast;
    private String country;
    private String date_added;
    private String year;
    private String rating;
    private String duration;
    private String listed_in;
    private String about;

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getListed_in() {
        return listed_in;
    }

    public void setListed_in(String listed_in) {
        this.listed_in = listed_in;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public NetflixMap(String sNo ,String type,String name,String director,String cast,String country,String date_added,String year,String rating,String duration,String listed_in,String about){
        this.sNo=sNo;
        this.type=type;
        this.name=name;
        this.director=director;
        this.cast=cast;
        this.country=country;
        this.date_added =date_added;
        this.year=year;
        this.rating=rating;
        this.duration=duration;
        this.listed_in =listed_in;
        this.about=about;


    }

    public String toString() {
       return "sno.:"+this.getsNo() +" type:"+this.getType()+ " name: "+this.getName()+" director: "+this.getDirector() + " cast:"+this.getCast()+ " country: "+this.getCountry()+ " date_added:" +this.getDate_added()+" year: "+this.getYear()+" rating: "+this.getRating()+" listed_in: "+this.getListed_in()+" about: "+this.getAbout();
    }

}
