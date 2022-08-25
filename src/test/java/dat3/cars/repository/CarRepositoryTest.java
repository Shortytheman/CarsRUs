package dat3.cars.repository;

import dat3.cars.entity.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CarRepositoryTest {
  @Autowired
  CarRepository carRepository;

  static int car1;
  static int car2;

  @BeforeAll
  public static void setUpData(@Autowired CarRepository carRepository){
    Car c1 = new Car("Volvo", "m1", 2000.0, 250.0);
    Car c2 = new Car("Mercedes", "Hurtig", 3000.0, 250.0);
    System.out.println(c1.getCarId());
    carRepository.save(c1);
    System.out.println(c1.getCarId());
    carRepository.save(c2);
    car1 = c1.getCarId();
    car2 = c2.getCarId();
  }

  @Test
  void testFindById(){
    Car found = carRepository.findById(car1).get();
    assertEquals(car1, found.getCarId());
  }

}