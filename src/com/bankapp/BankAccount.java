package com.bankapp;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){

        this.balance+=depositAmount;
        System.out.println("you have successfully deposited an amount of "+ depositAmount+ " your balance was topped up to "+ this.balance);
    }
    public void withdraw(double withdrawAmount){
        if (balance-withdrawAmount<0){
            System.out.println("You have Insufficient funds to make this transfer Your account balance is "+ this.balance);
        }else {
            this.balance-=withdrawAmount;
            System.out.println("you have successfully withdraw "+ withdrawAmount +" Your available balance is "+ this.balance);
        }


    }
}
