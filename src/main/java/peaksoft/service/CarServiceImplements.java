package peaksoft.service;

import peaksoft.dao.CarDao;
import peaksoft.dao.CarDaoImplements;
import peaksoft.models.Car;

import java.util.List;

public class CarServiceImplements implements CarService{

    private final CarDao CarDao;

    public CarDaoImplements(CarDao CarDao){
         this.CarDao = CarDao;
    }

    @Override
    public List<Car> getAllCars(){
        return carDao.getAllCars();
    }

    @Override
    public void addCar(Car car){
        carDao.addCar(car);
    }

    @Override
    public Car getById(Long id) {
        return carDao.getById(id);
    }

    @Override
    public void updateCar(Car car, Long id) {
        carDao.updateCar(car, id);
    }

    @Override
    public void deleteCar(Long id) {
        carDao.deleteCar(id);
    }

    @Override
    public Car get(Long id) {
        return carDao.get(id);
    }


}
