package com.example.day2_part2.controller;


import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {
        @GetMapping("/")
        public ArrayList<StudentModel> getStudents() {
            ArrayList<StudentModel> students = new ArrayList<>();
            students.add(new StudentModel(1, "Manya", "manyasethi2710@gmail.com"));
            students.add(new StudentModel(2, "Gauri", "gauri@gmail.com"));
            students.add(new StudentModel(3, "Rahul", "rahulk@gmail.com"));
            students.add(new StudentModel(4, "Naman", "naman27@gmail.com"));
            students.add(new StudentModel(5, "Gun", "gun10@gmail.com"));
            return students;
        }
}
