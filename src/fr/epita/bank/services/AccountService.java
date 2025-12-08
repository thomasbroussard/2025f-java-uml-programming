package fr.epita.bank.services;

import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.Stock;
import fr.epita.bank.datamodel.StockOrder;

import java.util.Date;

public class AccountService {



    public static StockOrder buyStocks(InvestmentAccount investmentAccount, Stock stock, Integer quantity) {
        StockOrder stockOrder = new StockOrder();
        stockOrder.setQuantity(quantity);
        stockOrder.setUnitPrice(stock.getUnitPrice());
        stockOrder.setTimestamp(new Date().getTime());
        stockOrder.setStock(stock);
        stockOrder.setInvestmentAccount(investmentAccount);

        investmentAccount.setBalance(investmentAccount.getBalance() - stockOrder.getQuantity() * stockOrder.getUnitPrice());
        return stockOrder;
    }

}
