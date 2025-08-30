package com.example.myproject.Service;

import com.example.myproject.Model.CourseRegistered;

import com.example.myproject.Repostry.RegisteredRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class registryservice {
    @Autowired
    RegisteredRepo repo;

    public List<CourseRegistered> registred() {
        return repo.findAll();
    }




    public void enroll(String name, String mail, String course) {
        CourseRegistered courseRegistered = new CourseRegistered(name,mail,course);
        repo.save(courseRegistered);
    }

}
