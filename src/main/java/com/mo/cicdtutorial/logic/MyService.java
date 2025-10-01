package com.mo.cicdtutorial.logic;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public double increaseNumbers(double num) {
        return num + 1;
    }

    public String greet() {
        return "Hello, World";
    }
}
