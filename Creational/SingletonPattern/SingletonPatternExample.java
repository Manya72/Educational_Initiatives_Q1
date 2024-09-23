package Creational.SingletonPattern;

// Client code to test the Singleton pattern
public class SingletonPatternExample {
    public static void main(String[] args) {
        // Getting the single instance of the DatabaseConnection class
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Connect to the database
        connection1.connect();

        // Verifying that both instances are the same
        System.out.println(connection1 == connection2);  // Output: true
    }
}
