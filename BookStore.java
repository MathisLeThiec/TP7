import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle() + " (Price: " + book.getPrice() + ")");
    }

    public List<Book> getBooks() {
        return books;
    }
}
