package web.config.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> returnCars(int number);
}