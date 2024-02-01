package com.example.shopee_s27152;

public class Customer {
    private int CustomerID;
    private double Balance;

    public Customer(int customerID, double balance) {
        CustomerID = customerID;
        Balance = balance;
    }

    public boolean canBuy(double price){
        return price <= getBalance();
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void mniejKasy(double price) {
        this.Balance -= price;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerID=" + CustomerID +
                ", Balance=" + Balance +
                '}';
    }
}
