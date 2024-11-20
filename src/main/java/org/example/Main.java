package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        // Create accounts
        accounts.add(new SavingsAccount(10000, 5, 2));  // Principal: 10,000, Rate: 5%, Time: 2 years
        accounts.add(new FixedDepositAccount(20000, 7, 3)); // Principal: 20,000, Rate: 7%, Time: 3 years
        accounts.add(new RecurringDepositAccount(5000, 6, 1)); // Principal: 5,000, Rate: 6%, Time: 1 year

        // display current balance for each account
        for (Account account : accounts) {
            System.out.println("Current balance for " + account.getClass().getSimpleName() + ": "
                    + String.format("%.2f", account.principal));
        }

        System.out.println("\n");

        // Calculate and display interest for each account
        for (Account account : accounts) {
            System.out.println("Interest for " + account.getClass().getSimpleName() + ": "
                    + String.format("%.2f", account.calculateInterest()));
        }

        System.out.println("\n");

        accounts.getFirst().withdraw(5000);

        System.out.println("Current balance for " + accounts.getFirst().getClass().getSimpleName() + ": "
                + String.format("%.2f", accounts.getFirst().principal));

        accounts.getFirst().deposit(10000);

        System.out.println("Current balance for " + accounts.getFirst().getClass().getSimpleName() + ": "
                + String.format("%.2f", accounts.getFirst().principal));
    }
}