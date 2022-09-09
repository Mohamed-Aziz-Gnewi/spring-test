package tn.ensit.spring.Cars.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.ensit.spring.Cars.Service.CarService;
import tn.ensit.spring.Cars.entities.Car;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/car/{model}")
    public Car getCarByModel(@PathVariable("model") String model)
    {
        return carService.findCarByModel(model);
    }

    @GetMapping("/carId")
    public  Car getCarById(@RequestParam("id") Long id)
    {
        return carService.getCarById(id);
    }
}
