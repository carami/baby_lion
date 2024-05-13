package org.example.iocexam;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("haha");
        System.out.println(book);
        System.out.println(book.getTitle());

        Book book2 = new Book();
        book2.setTitle("haha");

        if(book.equals(book2)){
            System.out.println("같다.");
        }
    }
}
