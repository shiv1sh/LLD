package DeignPatterns.ObserverDesignPattern.Observable;
import DeignPatterns.ObserverDesignPattern.Observer.NotificationsObserver;

import java.util.ArrayList;
import java.util.List;
public class IphoneObservable implements StocksObservable{
    List<NotificationsObserver> list = new ArrayList<>();
    int stockCount = 0;
    public void add(NotificationsObserver obj){
        list.add(obj);
    }

    public void remove(NotificationsObserver obj){
        list.remove(obj);
    }

    public void notifySubscribers(){
        for(NotificationsObserver observer : list){
            observer.update();
        }
    }

    public void setStockCount(int newStockCount){
        if(stockCount == 0 && newStockCount!= 0  ){
            notifySubscribers();
        }
        stockCount = newStockCount;
    }

    public int getStockCount(){
        return stockCount;
    }
}
