package com.example.myproject.Repostry;

import com.example.myproject.Model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<ProjectModel,Integer> {
}
