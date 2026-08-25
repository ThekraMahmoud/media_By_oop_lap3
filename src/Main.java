//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        // إنشاء User
        User user = new User();
        user.setUserName("Thekra");
        user.setEmail("thekra@gmail.com");


        // إنشاء Book
        Book book1 = new Book();
        book1.setStock(10);


        // إنشاء Review
        Review review1 = new Review(
                "Thekra",
                5,
                "Good Book"
        );

        Review review2=new Review(
                "Ali",
                2,
                "Bad Book"
        );



        // إضافة الـReview إلى الكتاب
        book1.addReview(review1);
        book1.addReview(review2);

        // طباعة متوسط التقييم
        System.out.println("Average Rating: "
                + book1.getAverageRating());


        // طباعة نوع الكتاب
        System.out.println("Media Type: "
                + book1.getMediaType());


        // شراء الكتاب
        book1.purchase(user);




    // طباعة مشتريات المستخدم
        System.out.println("Purchased Media: "
                + user.getPurchaseMedia());


        // طباعة الـstock بعد الشراء
        System.out.println("Stock after purchase: "
                + book1.getStock());
    }
