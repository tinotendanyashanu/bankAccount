package com.bankapp;

public class Main {
    public static void  main(String[] args){

        BankAccount tinotenda = new BankAccount(12222,0.00,"Tinotenda Nyashanu","tinotendanyash@gmail.com",785428900);
        tinotenda.withdraw(100);
    }
}
