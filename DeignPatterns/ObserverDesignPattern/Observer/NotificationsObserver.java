package DeignPatterns.ObserverDesignPattern.Observer;

import DeignPatterns.ObserverDesignPattern.Observable.StocksObservable;

public class NotificationsObserver {
    String email = "";
    StocksObservable obj;
    public NotificationsObserver(String email, StocksObservable obj){
        this.email = email;
        this.obj = obj;
    }
    public void update(){
        sendnotification();
    }
    public void sendnotification(){
        System.out.println(email+" Product is in stock!!");
    }
}
