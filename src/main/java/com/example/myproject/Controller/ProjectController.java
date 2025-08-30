package com.example.myproject.Controller;


import com.example.myproject.Model.ProjectModel;
import com.example.myproject.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController

public class ProjectController {
    @Autowired
    ProjectService s;

    @GetMapping("availablecourse")
    public List<ProjectModel> availablecourse(){
        return s.availablecourse();
    }


}
