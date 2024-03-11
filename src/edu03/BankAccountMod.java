package edu03;

public class BankAccountMod {
    public static void main(String[] args) {

    }

    private String accountNumber;
    private double balance;
    public int depo = 256;

    public BankAccountMod(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double balance, int depo) {
        this.balance += depo;
    }

    public void withdraw(String accountNumber, int withdrawAmount) {
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
        }
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


}
