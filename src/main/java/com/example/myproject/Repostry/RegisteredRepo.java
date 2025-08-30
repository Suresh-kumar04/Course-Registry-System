package com.example.myproject.Repostry;

import com.example.myproject.Model.CourseRegistered;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisteredRepo extends JpaRepository<CourseRegistered,Integer> {
}
