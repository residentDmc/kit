package DependencyInverse;

public class Main {
    public static void main(String[] args) {
        DatabaseManager managerSms = new DatabaseManager(new SMSNotification());
        DatabaseManager managerEmail = new DatabaseManager(new EmailNotification());
    }
}
