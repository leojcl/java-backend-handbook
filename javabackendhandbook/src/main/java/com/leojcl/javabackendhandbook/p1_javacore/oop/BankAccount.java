package com.leojcl.javabackendhandbook.p1_javacore.oop;


// abstract này sẽ định nghĩa các hành vi chung của tài khoản ngân hàng
public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // abstract method - mỗi loại tài khoản sẽ có cách tính lãi khác nhau
    public abstract double calculateInterest();

    // tương tự vậy, mỗi tài khoản cungx có phí rut tien khác nhau
    public abstract double getWithdrawalFee();

    public void displayAccountInfo(){
        System.out.println("Account number: "+ accountNumber);
        System.out.println("Account holder: "+ accountHolderName);
        System.out.println("Balance: $"+ balance);
    }


}
