package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getCars(List<Car> cars, int numberOfCars) {
        return numberOfCars > 5 ? cars.subList(0, 5) : cars.subList(0, numberOfCars);
    }
}
