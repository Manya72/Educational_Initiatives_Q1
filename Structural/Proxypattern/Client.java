package Structural.Proxypattern;

// Client.java
public class Client {
    public static void main(String[] args) {
        // Creating a payment proxy for a regular user
        Payment userPayment = new PaymentProxy("john");
        userPayment.processPayment(100.0);  // Should be denied

        // Creating a payment proxy for an admin user
        Payment adminPayment = new PaymentProxy("admin");
        adminPayment.processPayment(250.0);  // Should be processed successfully
    }
}
