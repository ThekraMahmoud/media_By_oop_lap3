import java.util.ArrayList;

public class Book extends Media {

    private int stock;
    private ArrayList<Review> reviews=new ArrayList<>();


    public Book() {

    }

    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList
            <Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addReview(Review r) {
        reviews.add(r);
    }

    public Double getAverageRating() {
        double rating = 0;
        Review rv = new Review();
        for (int i = 0; i < reviews.size(); i++) {
            rv = reviews.get(i);
            rating = rv.getRating() + rating;
        }
        rating = rating / reviews.size();
        return rating;
    }


    public void purchase(User user) {
        user.getPurchaseMedia().add(this);

        if (stock==0){
            System.out.println("Tha Book quintet is Finished");
        }else {
            stock = stock - 1;
        }
    }


    public boolean isBestseller() {
        if (getAverageRating() >= 4.5) {
            return true;
        } else {
            return false;
        }
    }


    public void restock(int quantity) {
        stock = stock + quantity;
        System.out.println("Book restocked. Current stock : " + stock);

    }


    public String getMediaType() {


        if (getAverageRating()>4.5){
            return "Bestselling Book";
        }else {
            return "Book";
        }

   }

    @Override
    public String toString() {
        return "Book{" +'\n'+
                "stock=" + stock +'\n'+
                ", reviews=" + reviews +
                '}';
    }
}





