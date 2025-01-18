import observable.PhoneStockObservable;
import observable.StockObservable;
import observer.EmailNotificationObserver;
import observer.NotificationObserver;
import observer.SMSNotificationObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockObservable observable = new PhoneStockObservable();
        NotificationObserver ob1 = new EmailNotificationObserver("abc@gmail", observable);
        NotificationObserver ob2 = new SMSNotificationObserver("46546453", observable);
        NotificationObserver ob3 = new EmailNotificationObserver("abc@gmail", observable);

        observable.add(ob1);
        observable.add(ob2);
        observable.add(ob3);

        observable.setStock(12);
        observable.setStock(15);
        observable.setStock(1);
    }
}