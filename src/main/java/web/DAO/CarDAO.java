package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    Car addCar(Car car);
    Car getCarByID(int id);
    List<Car> getCars();
    List<Car> getCarsByAmount(int id);
}
