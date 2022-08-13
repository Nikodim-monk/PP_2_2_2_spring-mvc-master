package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(HttpServletRequest request, ModelMap model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars",carService.getCars(request.getParameter("count")));
        return "cars";
    }

}
