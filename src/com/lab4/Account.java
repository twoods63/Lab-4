package com.lab4;

public class Account {
    private int accountNumber;
    private  double balance;
    private static int AccountCount = 10001;
    public Account() {
        this.accountNumber = AccountCount++;
        this.balance = 0;
    }
    public Account (double balance) {
        this.accountNumber = AccountCount++;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}