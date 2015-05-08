package ua.in.refresh.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.in.refresh.model.Subscriber;

@Repository
public class SubscriberDaoImpl implements SubscriberDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addSubscriber(Subscriber subscriber) {
        sessionFactory.getCurrentSession().save(subscriber);
    }

    public void removeSubscriber(Integer id) {
        Subscriber subscriber = (Subscriber) sessionFactory.getCurrentSession().load(Subscriber.class, id);
        if (subscriber != null) {
            sessionFactory.getCurrentSession().delete(subscriber);
        }
    }

    public Subscriber getSubscriber(Integer id) {
        return (Subscriber) sessionFactory.getCurrentSession().load(Subscriber.class, id);
    }
}
