package hiber.dao;

import hiber.model.*;

import java.util.List;
import java.util.Optional;

public interface CarDao {
    void add(Car car);
    List<Car> listCars();
    Optional<User> getUserByCar(String model,int series);
}
