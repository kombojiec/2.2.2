package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarServise{
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }

    @Override
    public List<Car> getCarsByAmount(int value) {
        return carDAO.getCarsByAmount(value);
    }
}
