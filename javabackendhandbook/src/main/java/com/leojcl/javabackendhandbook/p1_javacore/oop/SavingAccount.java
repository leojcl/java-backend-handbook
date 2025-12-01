package com.leojcl.javabackendhandbook.p1_javacore.oop;

// Saving account kế thừa từ BankAccount
public class SavingAccount extends BankAccount{

    private double interestRate = 0.04;
    private int minumumBalance = 1000;


    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance){
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getWithdrawalFee() {
        return balance < minumumBalance ? 5.0 : 0.0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit: $"+ amount);
            System.out.println("New balance: $"+ balance);
        }
    }
}
