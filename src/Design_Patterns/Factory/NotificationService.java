package Design_Patterns.Factory;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("");
        notification.notifyUser("This is my message.");
    }
}
