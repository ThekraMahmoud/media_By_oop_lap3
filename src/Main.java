

import java.util.ArrayList;

void main() {

    System.out.println("========== USER ==========");

    // إنشاء User
    User user = new User();
    user.setUserName("Thekra");
    user.setEmail("thekra@gmail.com");

    System.out.println("User: " + user.getUserName());
    System.out.println("Email: " + user.getEmail());


    System.out.println("\n========== BOOK ==========");

    // إنشاء Book
    Book book1 = new Book();
    book1.setStock(10);

    System.out.println("Initial Stock: " + book1.getStock());


    System.out.println("\n========== REVIEWS ==========");

    // إنشاء Reviews
    Review review1 = new Review(
            "Thekra",
            5,
            "Good Book"
    );

    Review review2 = new Review(
            "Ali",
            2,
            "Bad Book"
    );

    // إضافة الـ Reviews إلى الكتاب
    book1.addReview(review1);
    book1.addReview(review2);

    System.out.println("Review 1: " + review1);
    System.out.println("Review 2: " + review2);


    System.out.println("\n========== BOOK INFORMATION ==========");

    // متوسط التقييم
    System.out.println("Average Rating: "
            + book1.getAverageRating());

    // نوع الكتاب
    System.out.println("Media Type: "
            + book1.getMediaType());


    System.out.println("\n========== PURCHASE ==========");

    // شراء الكتاب
    book1.purchase(user);
    System.out.println("Stock after purchase: "
            + book1.getStock());


    System.out.println("\n========== MUSIC ==========");

    // إنشاء الأغاني
    Music music = new Music(
            "OH, MY, OH",
            "ThikraShami",
            "0",
            100.80,
            "MahmudAbdou"
    );

    Music music1 = new Music(
            "I Love You",
            "Bolo",
            "0",
            60,
            "MahmudAbdou"
    );

    Music music3 = new Music(
            "Howww",
            "Solo",
            "0",
            5.7,
            "TH"
    );


    // إنشاء Music Catalog
    ArrayList<Music> musicCatalog = new ArrayList<>();

    musicCatalog.add(music);
    musicCatalog.add(music1);
    musicCatalog.add(music3);

    System.out.println("Music Catalog:");
    System.out.println(musicCatalog);


    System.out.println("\n========== PLAYLIST ==========");

    System.out.println("Songs by "
            + music.getArtist() + ":");

    System.out.println(
            music.generatePlayList(musicCatalog)
    );


    System.out.println("\n========== USER PURCHASES ==========");

    System.out.println("Purchased Media:");
    System.out.println(user.getPurchaseMedia());




    System.out.println("\n========== Noval ==========");


    ArrayList<Review>r3=new ArrayList<>();
    r3.add(review1);
    r3.add(review2);
Novel n1=new Novel("ABC","OLI","998",5.8,7,r3,"io");
    System.out.println("Average Rating :"+n1.getAverageRating());
    System.out.println("Is Best ? "+n1.getMediaType());



    System.out.println("\n========== END ==========");
}


















//void main() {
//
//
// إنشاء User
//        User user = new User();
//        user.setUserName("Thekra");
//        user.setEmail("thekra@gmail.com");
//
//
//        // إنشاء Book
//        Book book1 = new Book();
//        book1.setStock(10);
//
//
//        // إنشاء Review
//        Review review1 = new Review(
//                "Thekra",
//                5,
//                "Good Book"
//        );
//
//        Review review2=new Review(
//                "Ali",
//                2,
//                "Bad Book"
//        );
//
//
//
//        // إضافة الـReview إلى الكتاب
//        book1.addReview(review1);
//        book1.addReview(review2);
//
//        // طباعة متوسط التقييم
//        System.out.println("Average Rating: "
//                + book1.getAverageRating());
//
//
//        // طباعة نوع الكتاب
//        System.out.println("Media Type: "
//                + book1.getMediaType());
//
//
//        // شراء الكتاب
//        book1.purchase(user);
//
//
//
//
//        // الاستماع
//    Music music=new Music("OH,MY,OH","ThikraShami","0",100.80,"MahmudAbdou");
//    Music music1=new Music("I love you ","Bolo","0",60,"MahmudAbdou");
//    Music music3=new Music("Howww ","Solo","0",5.7,"TH");
//
//    ArrayList<Music>musicCatalog=new ArrayList<>();
//    musicCatalog.add(music);
//    musicCatalog.add(music1);
//    musicCatalog.add(music3);
//
//
//    String a=music.getArtist();
//    String m= music.getMediaType();
//    System.out.println(music.generatePlayList(musicCatalog));
//
//
//
//
//
//    // طباعة مشتريات المستخدم
//        System.out.println("Purchased Media: "
//                + user.getPurchaseMedia());
//
//
//        // طباعة الـstock بعد الشراء
//        System.out.println("Stock after purchase: "
//                + book1.getStock());
//    }
