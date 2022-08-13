package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
