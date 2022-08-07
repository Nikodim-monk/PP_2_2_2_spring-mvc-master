package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> CarArray() {
        List<Car> cars = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car("car" + i, "model" + i, i*100));
        }
        return cars;
    }

    public List<Car> getCars(byte count) {
        return CarArray().subList(0,count);
    }
}
