import java.util.*;
import java.util.List;

class CryptoGenerator {

    private String coinName;
    private double coinValue;
    private int coinAmount;
    private float percentageOfCoinOwned;

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public double getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(double coinValue) {
        this.coinValue = coinValue;
    }

    public int getCoinAmount() {
        return coinAmount;
    }

    public void setCoinAmount(int coinAmount) {
        this.coinAmount = coinAmount;
    }

    public float getPercentageOfCoinOwned() {
        return percentageOfCoinOwned;
    }

    public void setPercentageOfCoinOwned(float percentageOfCoinOwned) {
        this.percentageOfCoinOwned = percentageOfCoinOwned;
    }

    void coinDetails() {
        System.out.println("<---------------Coin Details------------------->");
        System.out.println("Coin Name: " + coinName);
        System.out.println("Coin Exchange Rate: " + coinValue);
        System.out.println("No of coins left: " + coinAmount);
        System.out.println("Percentage of coin owned: " + percentageOfCoinOwned);
    }
}

class CryptoCoin {
    private CryptoGenerator coinDetails;

    public CryptoCoin(CryptoGenerator coinDetails) {
        this.coinDetails = coinDetails;
    }

    public CryptoGenerator getCoinDetails() {
        return coinDetails;
    }

    // Add any other methods or properties as needed to represent a CryptoCoin
}

class CryptoProfile {

    private List<CryptoCoin> cryptoCoins;

    public CryptoProfile() {
        cryptoCoins = new ArrayList<>();
    }

    public void addCryptoCoin(CryptoCoin cryptoCoin) {
        cryptoCoins.add(cryptoCoin);
    }

    public List<CryptoCoin> getCryptoCoins() {
        return cryptoCoins;
    }

    // Add any other methods or properties as needed for the CryptoProfile class
}

public class CryptoInvestor {

    public static void main(String[] args) {

        CryptoGenerator createCoin1 = new CryptoGenerator();
        createCoin1.setCoinName("DodgeCoin");
        createCoin1.setCoinAmount(10000);
        createCoin1.setCoinValue(12.0924824);
        createCoin1.setPercentageOfCoinOwned(2.3435454f);

        CryptoCoin coin1 = new CryptoCoin(createCoin1);

        CryptoProfile profile = new CryptoProfile();
        profile.addCryptoCoin(coin1);

        // Add more coins to the CryptoProfile if needed

        // Example usage:
        List<CryptoCoin> coins = profile.getCryptoCoins();
        for (CryptoCoin coin : coins) {
            displayCryptoCoinDetails(coin);
        }
    }

    public static void displayCryptoCoinDetails(CryptoCoin coin) {
        CryptoGenerator coinDetails = coin.getCoinDetails();
        System.out.println("<---------------Coin Details------------------->");
        System.out.println("Coin Name: " + coinDetails.getCoinName());
        System.out.println("Coin Exchange Rate: " + coinDetails.getCoinValue());
        System.out.println("No of coins left: " + coinDetails.getCoinAmount());
        System.out.println("Percentage of coin owned: " + coinDetails.getPercentageOfCoinOwned());
    }
}
