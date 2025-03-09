package com.lab4;

public class Checking extends Account {
    public Checking(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (getBalance() <= 0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            setBalance(getBalance() - 20);
        }
    }
}
