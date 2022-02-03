package com.cgi;

public class Wallet {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance = amount;
    }

    public void withdrawal(int amount) {
        this.balance -= amount;
    }
}