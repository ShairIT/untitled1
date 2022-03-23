package peaksoft.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import peaksoft.models.Car;

import java.util.List;

public class CarDaoImplements implements CarDao{

    private final SessionFactory sessionFactory;


    public CarDaoImplements(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Car> getAllCars(){
        return sessionFactory.openSession().createQuery("from Car").getResultList();
    }

    @Override
    public void addCar(Car car){
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(car);
        transaction.commit();
    }

    @Override
    public Car getById(Long id){
    return sessionFactory.getCurrentSession().find(Car.class, id);
    }

    @Override
    public void updateCar(Car car, Long id){
    Session session = sessionFactory.getCurrentSession();
    Transaction transaction = session.beginTransaction();
    Car car1 = session.get(Car.class, id);
    car1.setMark(car.getMark());
    car1.setPrice(car.getPrice());
    transaction.commit();
    }

    @Override
    public void deleteCar(Long id){
    Session session = sessionFactory.getCurrentSession();
    session.remove(session.get(Car.class, id));
    }

    @Override
    public void get(Long id){
    Session session = sessionFactory.getCurrentSession();
    Transaction transaction = session.beginTransaction();
    Car car = session.get(Car.class, id);
    transaction.commit();
    return car;
    }
}
