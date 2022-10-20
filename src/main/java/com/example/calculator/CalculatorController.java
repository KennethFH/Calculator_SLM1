package com.example.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalculatorController
{
    ArrayList<String> animals;
    @GetMapping("/")
    public String index()
    {
        return "Welcome to the Calculator API";
    }
    @GetMapping("/Sum")
    public int Sum(int a, int b)
    {
        return a+b;
    }
    @GetMapping("/add")
    public String addAnimals(String entry)
    {
        animals.add(entry);
        return "Das Tier war: " +entry;
    }
    @GetMapping("/Zoo")
    public String getAnimals()
    {
        return animals.toString();
    }
}
