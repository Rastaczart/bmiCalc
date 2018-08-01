package pl.akademiakodu.bmiCalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.bmiCalc.model.Value;


@Controller
public class BmiController {

@GetMapping("/")
public String addValue() {return "/add"; }

@GetMapping("/add")
    public String showValue (@ModelAttribute Value value, ModelMap modelMap ){
    modelMap.put("index",value.getInd());
    modelMap.put("info",value.info());
return "/show";}




}
