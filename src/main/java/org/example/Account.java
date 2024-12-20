package org.example;

public abstract class Account {
    protected double principal;
    protected double rate; // annual interest rate in percentage
    protected int time; // in years

    public Account(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public void deposit(double amount) {
        principal += amount;
    }

    public void withdraw(double amount) {
        principal -= amount;
    }

    public abstract double calculateInterest();
}
