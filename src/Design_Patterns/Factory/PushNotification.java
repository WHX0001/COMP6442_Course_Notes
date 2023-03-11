package Design_Patterns.Factory;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(String message){
        System.out.println(message + ": Push Notification");
    }
}
