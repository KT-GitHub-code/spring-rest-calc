package com.restcalc.restcalc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    //basic operations methods
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        return (double)a/b;
    }

}
