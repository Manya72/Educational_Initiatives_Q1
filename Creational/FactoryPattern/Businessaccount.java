package Creational.FactoryPattern;

// Concrete product - Savings Bank Account
// Concrete product - Business Bank Account
public class Businessaccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Business Account.");
    }

    @Override
    public void accountDetails() {
        System.out.println("Account Holder: ABC Corp\nBalance: $20,000\nAccount Type: Business Account");
    }
}
