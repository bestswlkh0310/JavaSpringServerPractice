//package exam;
//
//public class ApplicationContextMain {
//    public static void main(String[] args) throws Exception {
//        ApplicationContext context = ApplicationContext.getInstance();
//        Book book1 = (Book) context.getBean("book1");
//        book1.setTitle("아잇어");
//        book1.setPrice(2000);
//        System.out.println(book1.getTitle());
//        System.out.println(book1.getPrice());
//
//        Book book2 = (Book) context.getBean("book1");
//        System.out.println(book2.getTitle());
//        System.out.println(book2.getPrice());
//    }
//}