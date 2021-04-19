package com.company;

public class bankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount() {
        // This will work as default. It is optional. Constructor inside of a constructor.
        this("AIBK274578589 8909 90888", 0.00, "Natan Alves", "natanbreakman11ie@gmail.com", "+55 85 988637346");
        // The below method cannot come before the constructor.
        System.out.println("Empty constructor called");
    }
    // Constructor
    public bankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("bankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //---Deposit Funds---//
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + " " + "$" + depositAmount + " " + "made. New balance is " + "$" + this.balance);
    }

    //---Withdrawal Funds---//
    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only" + " " + "$" + this.balance + " " + "available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + " " + "$" + withdrawalAmount + " " + "processed. Remaining balance is " + "$" + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
