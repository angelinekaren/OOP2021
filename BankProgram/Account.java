package com.buatkode.learnjava;

public class Account {
    private double balance;

    // Constructor
    public Account(double initBalance) {
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        else {
            return false;
        }
    }
}

