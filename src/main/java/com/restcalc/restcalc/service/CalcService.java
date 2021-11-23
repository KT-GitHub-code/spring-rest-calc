package com.restcalc.restcalc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

}
