package observer;

import observable.StockObservable;

public class SMSNotificationObserver implements NotificationObserver{

    StockObservable observable;
    String number;

    // constructor injection
    public SMSNotificationObserver(String number, StockObservable observable) {
        this.observable = observable;
        this.number = number;
    }

    @Override
    public void update() {
        System.out.println("SMS notif for number " + number + ": stock in place: " + observable.getStock());
    }
}
