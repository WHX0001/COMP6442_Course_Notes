package Design_Patterns.Factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String message){
        System.out.println(message + ": SMS Notification");
    }
}
