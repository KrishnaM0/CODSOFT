package com.Tasks;

import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double intialBalance){
        this.balance = intialBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public double getBalance(){
        return balance;
    }
    public boolean withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            return true;
        }
        else{
            return false;
        }
    }
}

public class ATM{
    private static final Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1999);
        System.out.println();
        System.out.println("    --------------------------------------------------------");
        System.out.println("                         ATM INTERFACE                      ");
        System.out.println("    --------------------------------------------------------");
        displayOptions(account);

    }
    static void displayOptions(BankAccount account){
        while(true) {
            System.out.println();
            System.out.println("    ----------------------------");
            System.out.println("    |         ATM Menu         |");
            System.out.println("    ----------------------------");
            System.out.println("    |  1  |  Check Balance     |");
            System.out.println("    ----------------------------");
            System.out.println("    |  2  |  Deposit           |");
            System.out.println("    ----------------------------");
            System.out.println("    |  3  |  Withdraw          |");
            System.out.println("    ----------------------------");
            System.out.println("    |  4  |  Exit              |");
            System.out.println("    ----------------------------");
            int choice = getUserInput("\nEnter your choice : ");
            executeOptions(account, choice);
        }
    }
    static int getUserInput(String message){
        System.out.print(message);
        return scr.nextInt();
    }
    static void executeOptions(BankAccount account, int choice){
        switch(choice){
            case 1 :
                displayBalance(account);
                break;
            case 2 :
                depositAmount(account);
                break;
            case 3 :
                withdrawAmount(account);
                break;
            case 4 :
                exitATM();
                break;
            default :
                System.out.println("\n-> Invalid option. Please select a valid option");
        }
    }
    static void displayBalance(BankAccount account){
        System.out.println("\n-> Current Balance : " + account.getBalance());
    }
    static void depositAmount(BankAccount account){
        double depositAmount = getUserInput("Enter deposit amount : ");
        account.deposit(depositAmount);
        System.out.println("\n-> Deposit successful. Current Balance : " + account.getBalance());
    }
    static void withdrawAmount(BankAccount account) {
        double withdrawAmount = getUserInput("Enter withdrawal amount : ");
        boolean success = account.withdraw(withdrawAmount);
        if (success) {
            System.out.println("\n-> withdrawal successful. Current Balance : " + account.getBalance());
        }
        else {
            System.out.println("\n-> Insufficient funds. Withdrawal failed.");
        }
    }
    static void exitATM(){
        System.out.println("\n-> Exiting ATM. Thank You..!");
        System.exit(0);
    }
}
