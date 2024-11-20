package org.example;

public class SavingsAccount extends Account {
    public SavingsAccount(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    public double calculateInterest() {
        // Simple interest formula: SI = (P * R * T) / 100
        return (principal * rate * time) / 100;
    }
}
