package DesignComponents.DesignPatternsJava.FactoryDesignPattern;

import DesignComponents.DesignPatternsJava.FactoryDesignPattern.interfaces.Notification;
import DesignComponents.DesignPatternsJava.FactoryDesignPattern.domains.EmailNotification;
import DesignComponents.DesignPatternsJava.FactoryDesignPattern.domains.PushNotification;
import DesignComponents.DesignPatternsJava.FactoryDesignPattern.domains.SMSNotification;

/**
 * Create a factory class NotificationFactory.java to instantiate concrete class.
 */

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;

        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
