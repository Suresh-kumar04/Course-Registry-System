package com.example.myproject.Controller;

import com.example.myproject.Model.CourseRegistered;


import com.example.myproject.Service.registryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class registeredcontroller {
    @Autowired
    registryservice service;

    @GetMapping("registered")
    public List<CourseRegistered> registered(){

        return service.registred();
    }
    @PostMapping("/enrolled")
    public String enroll(@RequestParam("username") String name,@RequestParam("email") String mail,@RequestParam("coursename") String course){
         service.enroll(name,mail,course);
        return "enrollement success";
    }


    }

