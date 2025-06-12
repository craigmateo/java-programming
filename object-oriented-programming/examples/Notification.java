// Dynamic Binding Example

/* 
 *   What's happening:
 *   - Notification is the base class with a send() method.
 *   - EmailNotification and SMSNotification are subclasses that override send().
 *   - Even though the references (n1, n2) are of type Notification, the actual method called depends on the object type at runtime—this is dynamic binding.
 *   It makes your code flexible—e.g., a new PushNotification class could be added later with no changes to Main.
 * 
 * 
*/

// Notification.java
class Notification {
    void send(String message) {
        System.out.println("Sending generic notification: " + message);
    }
}

// EmailNotification.java
class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// SMSNotification.java
class SMSNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification(); // upcast to Notification
        Notification n2 = new SMSNotification();   // upcast to Notification

        n1.send("Meeting at 10 AM");
        n2.send("Your OTP is 123456");
    }
}
