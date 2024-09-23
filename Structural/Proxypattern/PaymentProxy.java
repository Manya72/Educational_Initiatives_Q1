package Structural.Proxypattern;

// PaymentProxy.java
public class PaymentProxy implements Payment {
    private RealPayment realPayment;
    private String user;

    public PaymentProxy(String user) {
        this.user = user;
    }

    private boolean checkAccess() {
        // Simulating an access check
        if (user.equalsIgnoreCase("admin")) {
            return true; // Admin has access to process payments
        }
        System.out.println("Access denied: Only admin can process payments.");
        return false;
    }

    private void logTransaction(double amount) {
        System.out.println("Logging transaction for $" + amount + " for user: " + user);
    }

    @Override
    public void processPayment(double amount) {
        if (checkAccess()) {
            if (realPayment == null) {
                realPayment = new RealPayment(user);
            }
            logTransaction(amount);
            realPayment.processPayment(amount);
        }
    }
}
