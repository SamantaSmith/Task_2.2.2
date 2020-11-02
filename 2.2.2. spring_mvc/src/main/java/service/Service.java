package service;

import model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class Service {



    public static List<CarModel> carsReturner() {

        List<CarModel> listCars = new ArrayList<>();
        for (int i = 0; i<5; i++) {

            listCars.add(new CarModel("Mers", i*10, "black"));
        }

        return listCars;
    }
}
