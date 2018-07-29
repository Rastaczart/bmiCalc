package pl.akademiakodu.bmiCalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class bmiController {

@GetMapping("/")
public String addValue() {return "/add"; }



}
