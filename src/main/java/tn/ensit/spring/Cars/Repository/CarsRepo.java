package tn.ensit.spring.Cars.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ensit.spring.Cars.entities.Car;

@Repository
public interface CarsRepo extends JpaRepository<Car,Long> {
    public Car findCarByModel(String model);
}
