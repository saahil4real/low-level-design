import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Book> booksList = Arrays.asList(
                new Book(100, "Science"),
                new Book(200, "English"),
                new Book(300, "Maths"),
                new Book(400, "Hindi"),
                new Book(500, "GK")
        );

        Library lib = new Library(booksList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}