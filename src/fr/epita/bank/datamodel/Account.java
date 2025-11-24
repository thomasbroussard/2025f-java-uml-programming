package fr.epita.bank.datamodel;

public class Account {


    private Customer customer;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
