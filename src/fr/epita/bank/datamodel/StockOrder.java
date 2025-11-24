package fr.epita.bank.datamodel;

public class StockOrder {
    private int unitPrice;
    private int quantity;
    private int timestamp;
    private Stock stock;
    private InvestmentAccount investmentAccount;

    public int getUnitPrice() {
        return unitPrice;
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

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
