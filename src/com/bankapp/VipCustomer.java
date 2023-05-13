package com.bankapp;

public class VipCustomer {
    private String Name;
    private double creditLimit;
    private  String email;

    public VipCustomer() {

    }

    public VipCustomer(String name, double creditLimit, String email) {
        Name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}