package Design_Patterns.Factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String message){
        System.out.println(message + ": Email Notification");
    }
}
