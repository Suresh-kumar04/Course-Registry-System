package com.example.myproject.Service;

import com.example.myproject.Model.ProjectModel;
import com.example.myproject.Repostry.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    CourseRepo r;

    public List<ProjectModel> availablecourse() {
        return r.findAll();
    }


}
