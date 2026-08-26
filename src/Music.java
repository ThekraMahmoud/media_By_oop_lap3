import java.util.ArrayList;

public class Music extends Media {
    private String artist;

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public void listen(User user) {
        user.getPurchaseMedia().add(this);
        System.out.println(user.getUserName() + " is listening to" + getTitle());
    }


    static Music music;

    public ArrayList<Music> generatePlayList(ArrayList<Music> musicCatalog) {

        ArrayList<Music> playList = new ArrayList<>();
        for (int i = 0; i < musicCatalog.size(); i++) {
            Music music = musicCatalog.get(i);
            if (music.getArtist().equals(this.artist)) {

                playList.add(music);
            }
        }return playList;
    }

    public String getMediaType() {
        if (getPrice()>=10){
            return "Premium Music";
        }else {
        return "Music";
    }

    }

    @Override
    public String toString() {
        return "Music{" +'\n'+
                "title ="+getTitle()+'\n'+
                "artist='" + artist + '\'' +
                '}';
    }
}
