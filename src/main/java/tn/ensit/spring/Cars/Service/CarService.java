package tn.ensit.spring.Cars.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ensit.spring.Cars.Repository.CarsRepo;
import tn.ensit.spring.Cars.entities.Car;

import java.util.List;

@Service
public class CarService implements ICarService {

    @Autowired
    private CarsRepo carsRepo;

    @Override
    public Car getCarById(Long id) {
        return carsRepo.findById(id).get();
    }

    @Override
    public Boolean contains(List<Integer> list, Integer number) {
        return list.contains(number);
    }

    @Override
    public Integer sizeOf(List<Integer> list) {
        return list.size();
    }

    @Override
    public Car findCarByModel(String model) {
        return carsRepo.findCarByModel(model);
    }


}
