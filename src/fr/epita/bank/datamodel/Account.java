package fr.epita.bank.datamodel;

public class Account {


    private Customer customer;
    private long balance;


    public Account(Customer customer, long balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
