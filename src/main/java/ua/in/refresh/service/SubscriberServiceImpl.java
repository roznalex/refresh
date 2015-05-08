package ua.in.refresh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.in.refresh.dao.SubscriberDao;
import ua.in.refresh.model.Subscriber;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private SubscriberDao subscriberDao;

    @Transactional
    public void addSubscriber(Subscriber subscriber) {
        subscriberDao.addSubscriber(subscriber);
    }

    @Transactional
    public void removeSubscriber(Integer id) {
        subscriberDao.removeSubscriber(id);
    }

    @Transactional
    public Subscriber getSubscriber(Integer id) {
        return subscriberDao.getSubscriber(id);
    }
}
