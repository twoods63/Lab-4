package com.lab4;

import java.util.*;
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = 0;
        Checking c = new Checking(bal);
        Savings s = new Savings(bal);
        while (true) {
            System.out.println("1. Withdraw from Checking\n2. Withdraw from Savings\n3. Deposit to Checking\n4. Deposit to Savings\n5. Balance of Checking\n6. Balance of Savings\n7. Award Interest to Savings now\n8. Quit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    bal = Double.parseDouble(sc.nextLine());
                    c.withdraw(bal);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    bal = Double.parseDouble(sc.nextLine());
                    s.withdraw(bal);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    bal = Double.parseDouble(sc.nextLine());
                    c.deposit(bal);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    bal = Double.parseDouble(sc.nextLine());
                    s.deposit(bal);
                    break;
                case 5:
                    System.out.println("Your balance for checking " + c.getAccountNumber() + " is " + c.getBalance());
                    break;
                case 6:
                    System.out.println("Your balance for savings " + s.getAccountNumber() + " is " + s.getBalance());
                    break;
                case 7:
                    s.addInterest();
                    break;
                case 8: System.exit(0);
            }
        }
    }
}