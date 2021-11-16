package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    Car addCar(Car car);
    Car getCarByID(int id);
    List<Car> getCars();
    List<Car> getCarsByAmount(int id);
}
