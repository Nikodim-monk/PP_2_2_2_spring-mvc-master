package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(HttpServletRequest request, ModelMap model) {
        CarService carService = new CarServiceImpl();
        String count = request.getParameter("count");
        if ((count == null) || (Byte.parseByte(count) > 5)) {
            count = "5";
        }
        List<Car> cars = carService.getCars(Byte.parseByte(count));

        model.addAttribute("cars",cars);
        return"cars";
}

}
