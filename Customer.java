public class Customer implements UserActions {
    @Override
    public void borrowBook(String bookTitle) {
        System.out.println("Customer borrows a book: " + bookTitle);
    }

    @Override
    public void returnBook(String bookTitle) {
        System.out.println("Customer returns a book: " + bookTitle);
    }

    @Override
    public void reviewBook(String bookTitle, String review) {
        System.out.println("Customer reviews a book: " + bookTitle + " with review: " + review);
    }

    // Admin-specific actions (Not applicable for Customer)
    @Override
    public void addBookToStore(String title, String type, double price) {
        // Not applicable for Customer, violates ISP
    }

    @Override
    public void removeBookFromStore(String title) {
        // Not applicable for Customer, violates ISP
    }
}
