package web.controller;

import model.CarModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") String count, ModelMap model) {
        List<CarModel> listCars = new ArrayList<>();
        for (int i = 0; i<5; i++) {

            listCars.add(new CarModel("Mers", i*10, "black"));
        }


        if (Integer.parseInt(count) == 0 | Integer.parseInt(count) >5) {
            model.addAttribute("cars", listCars);
        } else {

            List<CarModel> outputList = Service.carsReturner(listCars, Integer.parseInt(count));
            model.addAttribute("cars", outputList);
        }

        return "cars";
    }
}
