package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int numberOfCars, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 14, 1000));
        cars.add(new Car("BMW", 3, 3000));
        cars.add(new Car("Mercedes", 1, 5000));
        cars.add(new Car("Bentley", 2, 7000));
        cars.add(new Car("RR", 4, 9000));
        model.addAttribute("list", CarService.getCars(cars, numberOfCars));
        return "cars";
    }
}
