
class Notification{
    void sendNotification(){
        System.out.println("Notification sending ...");
    }
}

class EmailNotification extends Notification{
    @Override
    void sendNotification(){
        System.out.println("Email Notification sending ...");
    }
}

class SmsNotification extends Notification{
     @Override
    void sendNotification(){
         System.out.println("Sms Notification sending ...");
     }
}

public class Polymorphism {
    public static void main(String[] args){
        //changing values at runtime.
        //We create an object of EmailNotification but reference it using the parent class Notification.
        Notification n1 = new EmailNotification();
        n1.sendNotification();

        Notification n2 = new SmsNotification();
        n2.sendNotification();
    }
}
