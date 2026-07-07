import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(double price);
}

interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        System.out.println("\nStock Price Changed to: " + stockPrice);
        notifyObservers();
    }
}

class MobileApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Mobile App: Stock price updated to " + price);
    }
}

// Concrete Observer - Web App
class WebApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Web App: Stock price updated to " + price);
    }
}

public class ObserverPatternTest {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(105.75);

        stockMarket.deregisterObserver(webApp);
    }
}