package Creational.FactoryPattern;

// Factory class to create bank accounts
public class BankAccountFactory {

    // Factory method to create a specific type of bank account
    public BankAccount createBankAccount(String accountType) {
        if (accountType == null || accountType.isEmpty()) {
            return null;
        }

        switch (accountType.toLowerCase()) {
            case "personal":
                return new Personalaccount();
            case "business":
                return new Businessaccount();
            default:
                throw new IllegalArgumentException("Unknown account type: " + accountType);
        }
    }
}
