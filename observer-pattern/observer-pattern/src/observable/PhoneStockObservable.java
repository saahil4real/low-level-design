package observable;

import observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneStockObservable implements StockObservable{

    int totalStocks;
    List<NotificationObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationObserver obj) {
        observers.add(obj);
    }

    @Override
    public void remove(NotificationObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver obj : observers) {
            obj.update();
        }
    }

    @Override
    public void setStock(int data) {
        totalStocks = data;
        notifyObservers();
    }

    @Override
    public int getStock() {
        return totalStocks;
    }
}
