package com.example.myproject.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseRegistered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String username;
    private String email;
    private String coursename;

    public CourseRegistered(){

    }

    public CourseRegistered(String username, String email, String coursename) {

        this.username = username;
        this.email = email;
        this.coursename = coursename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
