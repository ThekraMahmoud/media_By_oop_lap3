public class Novel extends Book{

    private String gente;

    public Novel(int stock, Review[] reviews, String gente) {
        super(stock, reviews);
        this.gente = gente;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, Review[] reviews, String gente) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.gente = gente;
    }


    public String getGente() {
        return gente;
    }

    public void setGente(String gente) {
        this.gente = gente;
    }


    public String getMediaType(String media) {
        return media;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "gente='" + gente + '\'' +
                '}';
    }
}
