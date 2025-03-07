import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
        System.out.println("Book added: " + title);
    }

    public List<String> getBooks() {
        return books;
    }
}