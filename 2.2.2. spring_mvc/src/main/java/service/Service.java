package service;

import model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static List<CarModel> carsReturner(List<CarModel> l, int count) {

        List<CarModel> list = new ArrayList<>();
        for (int i = 0; i<count; i++) {

            list.add(l.get(i));
        }
        return list;
    }
}
