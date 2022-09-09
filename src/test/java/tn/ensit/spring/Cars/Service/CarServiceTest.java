package tn.ensit.spring.Cars.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {


    @Test
    void contains() {

        ICarService service = new CarService();
        List<Integer> list = List.of(1,2,3);
        Integer number = 1;

        //act

        Boolean response = service.contains(list,number);
        //Assert

        assertThat(response).isTrue();
    }

    @Test
    void sizeOf_should_return_the_size_of_list() {
        ///arrange

        ICarService service = new CarService();
        List<Integer> list = List.of(1,2,3);

        ///act
        Integer result = service.sizeOf(list);

        //assert
        assertThat(result).isEqualTo(3);
    }
}