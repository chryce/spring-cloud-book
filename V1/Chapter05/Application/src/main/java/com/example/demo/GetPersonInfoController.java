package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPersonInfoController {


    @Autowired
    private GetPersonInfoProperties getPersonInfoProperties;


    @Value("${age}")
    private int age;

    @Value("${name}")
    private String name;

    @GetMapping("/getage")
    public int getAge() {
        return age;
    }

    @GetMapping("/getname")
    public String getName() {
        return name;
    }


    @GetMapping("/getpersonproperties")
    public String getpersonproperties() {
        return getPersonInfoProperties.getName() + getPersonInfoProperties.getAge();
    }
}
