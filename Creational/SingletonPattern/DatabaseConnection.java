package Creational.SingletonPattern;

// Singleton class to manage database connections
public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Private constructor to prevent instantiation from outside
    private DatabaseConnection() {
        // Private constructor to prevent instantiation
    }

    // Method to get the single instance of the class
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Method to simulate database connection
    public void connect() {
        System.out.println("Database connected.");
    }
}
