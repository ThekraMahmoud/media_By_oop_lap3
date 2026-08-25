import java.util.ArrayList;

public class Novel extends Book{

    private String gente;

    public Novel(int stock, ArrayList<Review> reviews, String gente) {
        super(stock, reviews);
        this.gente = gente;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String gente) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.gente = gente;
    }


    public String getGente() {
        return gente;
    }

    public void setGente(String gente) {
        this.gente = gente;
    }


    public String getMediaType() {
      if (getAverageRating()>=4.5){
          return "Bestselling Novel";
      }else {
          return "Novel";
      }
    }

    @Override
    public String toString() {
        return "Novel{" +
                "gente='" + gente + '\'' +
                '}';
    }
}
