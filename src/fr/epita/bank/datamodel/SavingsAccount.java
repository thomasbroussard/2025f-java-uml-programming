package fr.epita.bank.datamodel;

public class SavingsAccount extends Account {
    private int interestRate;

    public SavingsAccount(Customer customer, long balance, int interestRate) {
        super(customer, balance);
        this.interestRate = interestRate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
