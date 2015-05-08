package ua.in.refresh.dao;

import ua.in.refresh.model.Subscriber;

public interface SubscriberDao {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Integer id);
    Subscriber getSubscriber(Integer id);
}
