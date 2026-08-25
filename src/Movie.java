import java.util.ArrayList;

public class Movie extends Media{
    private int duration;



    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(Media title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }



    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void watch(User user){

        User u=new User();
        u.getPurchaseMedia().add(getTitle());
    }

    public ArrayList<Movie>movieCatalog(ArrayList<Movie>m){
        m.contains(getAuteur());
        return movieCatalog(m);
    }




    public String getMediaType(Media media){
        if (duration>=120){
            return "Long Movie";
        }else {
            return "move";
        }

    }




    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}

