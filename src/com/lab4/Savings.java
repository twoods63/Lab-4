package com.lab4;

public class Savings extends Account {
    public int depositCount = 0;

    public Savings(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);

            if (getBalance() < 500) {
                System.out.println("Charging a fee of $10 because you are below $500.");
                setBalance(getBalance() - 10);
            } else {
                System.out.println("Insufficient Funds in Account...");
            }
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        this.depositCount++;
        System.out.println("This is deposit number " + this.depositCount + " to this account.");
        if (this.depositCount >= 5) {
            System.out.println("Charging a fee of $10.");
            setBalance(getBalance() - 10);
        }
    }

    public void addInterest() {
        float interest = (float) (getBalance() * 1.5 / 100);
        System.out.println("Customer earned " + interest + " in interest ");
        setBalance(getBalance() + interest);
    }
}
