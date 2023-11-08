package DesignComponents.DesignPatternsJava.FactoryDesignPattern.domains;

import DesignComponents.DesignPatternsJava.FactoryDesignPattern.interfaces.Notification;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification");
    }
}
