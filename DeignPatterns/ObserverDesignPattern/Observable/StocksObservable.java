package DeignPatterns.ObserverDesignPattern.Observable;

import DeignPatterns.ObserverDesignPattern.Observer.NotificationsObserver;

public interface StocksObservable {
    public void add(NotificationsObserver obj);
    public void remove(NotificationsObserver obj);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
