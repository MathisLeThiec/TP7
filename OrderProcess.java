public class OrderProcess {
    private NotificationService notificationService;

    public OrderProcess(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(String bookTitle, String userEmail) {
        System.out.println("Processing order for " + bookTitle);
        notificationService.sendNotification(userEmail, "Your order for " + bookTitle + " has been processed.");
    }
}
