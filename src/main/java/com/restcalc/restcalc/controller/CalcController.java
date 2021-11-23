package com.restcalc.restcalc.controller;

import com.restcalc.restcalc.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    //field injection of CalcService dependency (DI)
    @Autowired
    public CalcService calcService;

    //GET index route
    @GetMapping()
    public String index(){
        return "Welcome to the calculator app! To do calculations POST an array of two numbers to the following routes: /add, /subtract, /multiply, /divide.\"";
    }

    //POST routes for operations
    @PostMapping("/add")
    public int add(@RequestBody int[] nums){
        return calcService.add(nums[0], nums[1]);
    }

    @PostMapping("/subtract")
    public int subtract(@RequestBody int[] nums){
        return calcService.subtract(nums[0], nums[1]);
    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody int[] nums){
        return calcService.multiply(nums[0], nums[1]);
    }

    @PostMapping("/divide")
    public double divide(@RequestBody int[] nums){
        return calcService.divide(nums[0], nums[1]);
    }

}
