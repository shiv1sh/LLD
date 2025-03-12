package DeignPatterns.ObserverDesignPattern;

import DeignPatterns.ObserverDesignPattern.Observable.IphoneObservable;
import DeignPatterns.ObserverDesignPattern.Observer.NotificationsObserver;

public class Store {

    public static void main(String args[]){
        IphoneObservable iphone = new IphoneObservable();
        NotificationsObserver observer1 = new NotificationsObserver("shivkasht2001@gmail.com", iphone);
        NotificationsObserver observer2 = new NotificationsObserver("abc123@gmail.com", iphone);
        iphone.add(observer1);
        iphone.add(observer2);
        iphone.setStockCount(2);
    }
}
