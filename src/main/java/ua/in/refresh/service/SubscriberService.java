package ua.in.refresh.service;

import ua.in.refresh.model.Subscriber;

public interface SubscriberService {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Integer id);
    Subscriber getSubscriber(Integer id);
}
