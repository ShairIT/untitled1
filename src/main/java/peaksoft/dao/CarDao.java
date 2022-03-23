package peaksoft.dao;

import peaksoft.models.Car;

import java.util.List;

public interface CarDao {

    List<Car> getAllCars();

    void addCar(Car car);

    Car getById(long id);

    void updateCar(Car car, long id);

    void deleteCar(long id);

    Car get(long id);
}
