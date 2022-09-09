package tn.ensit.spring.Cars.Service;

import tn.ensit.spring.Cars.entities.Car;

import java.util.List;

public interface ICarService {
    public Car getCarById(Long id);
    public Boolean contains(List<Integer> list, Integer number);
    public Integer sizeOf(List<Integer> list);
    public Car findCarByModel(String model);
}
