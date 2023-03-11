package Design_Patterns.Factory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NotificationFactory {
    public Notification createNotification(String channel){
        //Assign a channel if it has not been identified.
        if(channel == null || channel.isEmpty()){
            List<String> messageList = Arrays.asList("SMS", "EMAIL", "PUSH");
            Random random = new Random();
            channel = messageList.get(random.nextInt(messageList.size()));
        }

        if("SMS".equalsIgnoreCase(channel)){
            return new SMSNotification();
        } else if ("EMAIL".equalsIgnoreCase(channel)) {
            return new EmailNotification();
        } else if ("PUSH".equalsIgnoreCase(channel)){
            return new PushNotification();
        }

        //return null if the assigned channel is invalid.
        return null;
    }
}
