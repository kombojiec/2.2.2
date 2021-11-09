package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{
    private List<Car> garage = new ArrayList<>();

    public CarDAOImpl(){
        garage.add(new Car("Audi", "A8", 2015));
        garage.add(new Car("BMW", "Z3", 2017));
        garage.add(new Car("Mazda", "CX-5", 2020));
        garage.add(new Car("Porsche", "Cayenne", 2008));
        garage.add(new Car("Lada", "kopeechka", 1985));
    }

    @Override
    public Car addCar(Car car) {
        garage.add(car);
        return car;
    }

    @Override
    public Car getCarByID(int id) {
        return garage.get(id);
    }

    @Override
    public List<Car> getCars() {
        return garage;
    }

    @Override
    public List<Car> getCarsByAmount(int id) {
        if(id >= 5) {
            return getCars();
        }
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < id; i++) {
            list.add(garage.get(i));
        }
        return list;
    }
}
