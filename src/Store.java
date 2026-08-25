import java.util.ArrayList;

public class Store
{
   private  ArrayList<User>users;

//    private User[] user;

     private ArrayList <Media>media;
//    private Media[]media;

    public Store(ArrayList<User> users, ArrayList<Media> media) {
        this.users = users;
        this.media = media;
    }

    public ArrayList<User> getUser() {
        return users;
    }

    public void setUser(ArrayList<User> user) {
        this.users = user;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }
    public void addUser(User user){
        users.add(user);
    }
    public ArrayList<User> displayUser(){
       return users;
    }
}

