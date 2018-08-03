package pl.akademiakodu.bmiCalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.bmiCalc.model.Bmr;

@Controller
public class BmrController {
    @GetMapping("/bmr")
    public String addBmr() {
        return "addbmr";
    }

    @GetMapping("/addbmr")
    public String Bmrshow(@ModelAttribute Bmr bmr, ModelMap modelMap) {
        System.out.println("bmr " + bmr + " a wartosc to" + bmr.bmrIndex());
        modelMap.put("index", bmr.bmrIndex());
        return "/showbmr";
    }
}
