package Creational.FactoryPattern;

import java.util.Scanner;

// Client code to demonstrate the Factory Design Pattern
public class BankSystem {
    public static void main(String[] args) {
        BankAccountFactory factory = new BankAccountFactory();

        // Taking user input for account creation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank. Please enter the type of account you'd like to create (personal, business, checking):");
        String accountType = scanner.nextLine();

        // Creating the appropriate account based on user input
        BankAccount account = factory.createBankAccount(accountType);

        if (account != null) {
            account.accountType();
            account.accountDetails();
        } else {
            System.out.println("Invalid account type entered.");
        }

        scanner.close();
    }
}
