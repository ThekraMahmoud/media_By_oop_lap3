import java.util.ArrayList;

public class User {


    private String userName;
    private String email;

    private ArrayList<Media> purchaseMedia = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    public User(){
    }
    public User(String userName, String email, ArrayList<Media> purchaseMedia, ArrayList<Media> shoppingCart) {
        this.userName = userName;
        this.email = email;
        this.purchaseMedia = purchaseMedia;
        this.shoppingCart = shoppingCart;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //    public Media[] getPurchaseMedia() {
    public ArrayList<Media> getPurchaseMedia() {
        return purchaseMedia;
    }

    //    public void setPurchaseMedia(Media[] purchaseMedia) {
    public void setPurchaseMedia(ArrayList<Media> purchaseMedia) {
        this.purchaseMedia = purchaseMedia;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    public void addToCart(Media media) {
       if( media instanceof Book){
          if(((Book) media).getStock()<=0){
              System.out.println("Finsh");
          }
          else {
              shoppingCart.add(media);
              System.out.println("Add Successfully");

          }
       }
    }



    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }


    public void checkOut() {

        if (!shoppingCart.isEmpty()) {
            //هنا فقط عينت  object
            purchaseMedia.addAll(shoppingCart);
        }
        for (Media media : shoppingCart) {
            if (media instanceof Book) {
                //كاني اقوله الوسائط اعتبرها بوك وتعامل معاها زي البوك

                //نا تأكدت أن الـobject الموجود في media هو من نوع Book، لذلك سويت Casting وخليت Java تتعامل مع نفس الـobject على أنه Book حتى أقدر أستخدم getStock() و setStock().
                Book book = (Book) media;
                int stock = book.getStock();
                book.setStock(stock - 1);
            }

        }

        shoppingCart.clear();


    }
        }

