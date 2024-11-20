package org.example;

public class RecurringDepositAccount extends Account {
    public RecurringDepositAccount(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    public double calculateInterest() {
        // RD formula: Interest = (P * N * (N+1) * R) / (2 * 12 * 100)
        int months = time * 12;
        return (principal * months * (months + 1) * rate) / (2 * 12 * 100);
    }
}
