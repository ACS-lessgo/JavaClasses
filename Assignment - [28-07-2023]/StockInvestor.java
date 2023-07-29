import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Details of stock --> [stock name, and listed stock price]
class Stock {
    private String name;
    private double currentPrice;

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    void display() {
        System.out.println("\n The stock " + name + " was bought at the price of " + currentPrice);
    }
}

//Buy or sell stocks simulation
class Portfolio {
 private HashMap<Stock, Integer> heldQuantity; // To store the held quantity of each stock
 private HashMap<Stock, Integer> soldQuantity; // To store the sold quantity of each stock
 private HashMap<Stock, Integer> holdings;

 public Portfolio() {
     holdings = new HashMap<>();
     heldQuantity = new HashMap<>();
     soldQuantity = new HashMap<>();
 }

 // Method to buy stocks and add them to the portfolio
 public void buyStock(Stock stock, int quantity) {
     if (quantity <= 0) {
         throw new IllegalArgumentException("Quantity must be a positive integer.");
     }

     int currentQuantity = holdings.getOrDefault(stock, 0);
     holdings.put(stock, currentQuantity + quantity);
     heldQuantity.put(stock, heldQuantity.getOrDefault(stock, 0) + quantity);
     System.out.println("\n" + "Current No of " + stock.getName() + " held: " + (currentQuantity + quantity));
 }

 // Method to sell stocks from the portfolio
 public void sellStock(Stock stock, int quantity) {
     if (quantity <= 0) {
         throw new IllegalArgumentException("Quantity must be a positive integer.");
     }

     int currentQuantity = holdings.getOrDefault(stock, 0);
     int newQuantity = currentQuantity - quantity;

     if (newQuantity < 0) {
         throw new IllegalArgumentException("Cannot sell more stocks than available in the portfolio.");
     }

     holdings.put(stock, newQuantity);
     soldQuantity.put(stock, soldQuantity.getOrDefault(stock, 0) + quantity);

     if (newQuantity == 0) {
         holdings.remove(stock); // Remove the stock if the quantity becomes zero
     }
     System.out.println("\n" + "Current No of " + stock.getName() + " held: " + newQuantity);
 }

 // Method to calculate the total value of the portfolio based on the held quantity and purchased prices
 public double calculatePortfolioValue() {
     double totalValue = 0.0;

     for (Stock stock : holdings.keySet()) {
         int quantity = heldQuantity.getOrDefault(stock, 0);
         double stockValue = stock.getCurrentPrice() * quantity;
         totalValue += stockValue;
         System.out.println("\n Quantity of stocks held: " + quantity + ", value of each stock at which it was bought: "
                 + stock.getCurrentPrice() + "\n The value of your profile is: " + totalValue + "\n");
     }
     return totalValue;
 }

 // Method to calculate the total value of the portfolio based on the sold quantity and purchased prices
 public double newPortfolioValue() {
     double totalValue = 0.0;

     for (Stock stock : soldQuantity.keySet()) {
         int quantity = soldQuantity.getOrDefault(stock, 0);
         //double purchasedPrice = stock.getCurrentPrice();
         int min=0;
         int max=1000;
         double newPrice = Math.floor(Math.random()*(max-min+1)+min);
         double stockValue = newPrice * quantity;
         totalValue += stockValue;
         System.out.println("\n Quantity of stocks sold: " + quantity + ", value of each stock at the time of selling: "
                 + newPrice + "\n The value of your profile is: " + totalValue + "\n");
     }
     System.out.println("\n The value of your profile is: " + totalValue);
     return totalValue;
 }

 // Method to get the quantity of a specific stock in the portfolio
 public int getStockQuantity(Stock stock) {
     return holdings.getOrDefault(stock, 0);
 }
}

//Predefines set of stocks u can buy
// Creating a map --> Map<String, Double> stockPrices = new HashMap<>();
class StockMap {

    // Creating a map to store stock names and their initial prices
    public static Map<String, Double> stockPrices = new HashMap<>();

    public void stockMarketView() {
        // Adding stock names and initial prices to the map to simulate trading
        stockPrices.put("APPLE", 150.0);
        stockPrices.put("GOOGLE", 280.0);
        stockPrices.put("MICROSOFT", 300.0);
        stockPrices.put("NOKIA", 436.12);
        stockPrices.put("AMAZ0N", 300.0);
        stockPrices.put("TESLA", 750.0);
        stockPrices.put("FACEBOOK", 330.0);
        stockPrices.put("NETFLIX", 540.0);
        stockPrices.put("BLACKBERRY", 220.0);
        stockPrices.put("NVDIA", 230.0);
        stockPrices.put("PIZZAHUT", 250.0);
        stockPrices.put("MCDONALDS", 420.0);
        stockPrices.put("SQL", 220.0);
        stockPrices.put("TATAPOWER", 45.0);
        stockPrices.put("ORACLE", 75.0);
        stockPrices.put("KIRLOSKAR", 54.0);
        stockPrices.put("RELIANCE", 180.0);
        stockPrices.put("AIRTEL", 220.0);
        stockPrices.put("BLACKBOX", 165.0);
        stockPrices.put("WALMART", 140.0);
        stockPrices.put("META", 55.0);
        stockPrices.put("OPENAI", 140.0);
    }

    public void display() {
        System.out.println("<------------------------Current Market------------------------------>\n");
        for (Map.Entry<String, Double> entry : stockPrices.entrySet()) {
            String stockName = entry.getKey();
            double stockPrice = entry.getValue();
            System.out.println(stockName + ": $" + stockPrice);
        }
        System.out.println("\n<--------------------------------------------------------------------->");
    }
}

//Thread class for buying stocks
class BuyStockThread extends Thread {
    private Portfolio portfolio;
    private Stock stock;
    private int quantity;
    private StringBuilder updates;

    public BuyStockThread(Portfolio portfolio, Stock stock, int quantity) {
        this.portfolio = portfolio;
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        portfolio.buyStock(stock, quantity);
    }
}

//Main method to view and maintain your Portfolio
public class StockInvestor {

    public static void main(String[] args) {
        // Initialize the market
        StockMap market = new StockMap();
        Portfolio portfolio = new Portfolio();
        market.stockMarketView();
        market.display();

        // Creating multiple stock instances for buying
        Stock stock1 = new Stock("GOOGLE", 280.0);
        Stock stock2 = new Stock("ORACLE", 75.0);
        Stock stock3 = new Stock("META", 55.0);

        Thread buyStock1Thread = new BuyStockThread(portfolio, stock1, 50);
        Thread buyStock2Thread = new BuyStockThread(portfolio, stock2, 20);
        Thread buyStock3Thread = new BuyStockThread(portfolio, stock3, 15);

        buyStock1Thread.start();
        buyStock2Thread.start();
        buyStock3Thread.start();

        try {

            buyStock1Thread.join();
            buyStock2Thread.join();
            buyStock3Thread.join();

            // Calculate and print the portfolio's value after buying
            double initialValue = portfolio.calculatePortfolioValue();
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Initial Portfolio Value: $" + initialValue);
            System.out.println("-------------------------------------------------------------------------------------");

            // Selling of stocks
            portfolio.sellStock(stock1, 50);
            portfolio.sellStock(stock2, 20);
            portfolio.sellStock(stock3, 15);

            // Calculate and print the portfolio's value after selling
            double finalValue = portfolio.newPortfolioValue();
            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.println("Final Portfolio Value: $" + finalValue);

            // Calculate and print the net trade-off (profit or loss)
            double netTradeOff = finalValue - initialValue;
            if (netTradeOff > 0) {
                System.out.println("Net Profit made: $" + netTradeOff);
            } else {
                System.out.println("Net Loss made: $" + netTradeOff);
            }
            System.out.println("----------------------------------------------------------------------------------------");

            System.out.println("Report is being generated ....");
            FileOutputStream fileOutputStream = new FileOutputStream("PortfolioReport.txt");
            String reportData = "Stocks purchased\n"
                    + stock1.getName() + ", Price: $" + stock1.getCurrentPrice() + ", Quantity: 50\n"
                    + stock2.getName() + ", Price: $" + stock2.getCurrentPrice() + ", Quantity: 20\n"
                    + stock3.getName() + ", Price: $" + stock3.getCurrentPrice() + ", Quantity: 15\n\n"
                    + "Initial Portfolio Value: $" + initialValue + "\n" + "Final Portfolio Value: $" + finalValue
                    + "\n" + "Trade Outcome: $" + netTradeOff;
            byte array[] = reportData.getBytes();
            fileOutputStream.write(array);

            System.out.println("Report generated ...");
            fileOutputStream.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
