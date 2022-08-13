package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    List<Car> cars = new ArrayList<>();
    {
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car("car" + i, "model" + i, i*100));
        }
    }

    @Override
    public List<Car> getCars(String count) {
        if ((count == null) || (Byte.parseByte(count) > 5)) {
            count = "5";
        }
        return cars.subList(0, Integer.parseInt(count));
    }
}
