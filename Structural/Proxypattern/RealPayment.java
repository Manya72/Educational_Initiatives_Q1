package Structural.Proxypattern;

// RealPayment.java
public class RealPayment implements Payment {
    private String user;

    public RealPayment(String user) {
        this.user = user;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " for user: " + user);
    }
}
