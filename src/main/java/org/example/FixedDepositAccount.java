package org.example;

public class FixedDepositAccount extends Account {
    public FixedDepositAccount(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    public double calculateInterest() {
        // Compound interest formula: A = P * (1 + R/100)^T, Interest = A - P
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount - principal;
    }
}
