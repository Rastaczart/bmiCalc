package pl.akademiakodu.bmiCalc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.bmiCalc.dao.BmiDao;
import pl.akademiakodu.bmiCalc.model.Bmr;
import pl.akademiakodu.bmiCalc.model.Value;


@Controller
public class BmiController {

@Autowired
private BmiDao bmiDao;

@GetMapping("/")
public String addValue() {return "/add"; }

@GetMapping("/add")
    public String showValue (@ModelAttribute Value value, ModelMap modelMap ){
    modelMap.put("index",value.getInd());
    modelMap.put("info",value.info());
    bmiDao.save(value);
return "/show";}
@GetMapping("/all")
    public String showAll (ModelMap modelMap){
    modelMap.put("values",bmiDao.findAll());
    return "/all";
}



}

