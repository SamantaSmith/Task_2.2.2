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
        List<CarModel> listCars;
        listCars = Service.carsReturner();


        if (Integer.parseInt(count) == 0 | Integer.parseInt(count) >5) {
            model.addAttribute("cars", listCars);
        } else {

            List<CarModel> outputList = new ArrayList<>();
            for(int i = 0; i<Integer.parseInt(count); i++) {

               outputList.add(i, listCars.get(i));
            }

            model.addAttribute("cars", outputList);
        }

        return "cars";
    }
}
