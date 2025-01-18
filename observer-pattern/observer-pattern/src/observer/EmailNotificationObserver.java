package observer;

import observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver{

    StockObservable observalble;
    String email;

    public EmailNotificationObserver(String email, StockObservable observalble) {
        this.email = email;
        this.observalble = observalble;
    }

    @Override
    public void update() {
        System.out.println("Email notif for " + email + " : stock in place: " + observalble.getStock());
    }
}
