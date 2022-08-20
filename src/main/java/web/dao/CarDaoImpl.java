package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Wish", 2007));
        cars.add(new Car("Nissan", "Skyline", 2000));
        cars.add(new Car("Ford", "Mustang", 2010));
        cars.add(new Car("Subaru", "Forester", 2013));
        cars.add(new Car("Lada", "Vesta", 2015));
    }

    public List<Car> getCarsList(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
