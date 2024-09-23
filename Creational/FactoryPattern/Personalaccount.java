package Creational.FactoryPattern;

// Concrete product - Personal Bank Account
public class Personalaccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Personal Account.");
    }

    @Override
    public void accountDetails() {
        System.out.println("Account Holder: John Doe\nBalance: $5,000\nAccount Type: Personal Account");
    }
}
