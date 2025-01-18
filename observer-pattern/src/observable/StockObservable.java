package observable;

import observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver obj);
    void remove(NotificationObserver obj);
    void notifyObservers();
    void setStock(int data);
    int getStock();
}
