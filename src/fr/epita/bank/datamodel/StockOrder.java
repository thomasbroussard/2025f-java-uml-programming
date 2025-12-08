package fr.epita.bank.datamodel;

public class StockOrder {
    private int unitPrice;
    private int quantity;
    private long timestamp;
    private Stock stock;
    private InvestmentAccount investmentAccount;

    public int getUnitPrice() {
        return unitPrice;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public InvestmentAccount getInvestmentAccount() {
        return investmentAccount;
    }

    public void setInvestmentAccount(InvestmentAccount investmentAccount) {
        this.investmentAccount = investmentAccount;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
