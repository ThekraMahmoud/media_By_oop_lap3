import java.util.ArrayList;

public class Movie extends Media{
    private int duration;



    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
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
        user.getPurchaseMedia().add(this);
        System.out.println(user.getUserName()+" Watch :"+getTitle());
    }

    public ArrayList<Movie>recommendSimilarMovies(ArrayList<Movie>movieCatalog){
        ArrayList<Movie>recommendSimilarMovies=new ArrayList<>();

        for(int i =0;i<movieCatalog.size();i++){
            if (movieCatalog.get(i).getAuteur().equals(this.getAuteur())){
                recommendSimilarMovies.add(movieCatalog.get(i));
            }
        }            return recommendSimilarMovies;

    }


    public String getMediaType(){
        if (duration>=120){
            return "Long Movie";
        }else {
            return "Movie";
        }

    }




    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}

