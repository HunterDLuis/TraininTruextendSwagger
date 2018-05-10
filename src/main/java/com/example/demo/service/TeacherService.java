package com.example.demo.service;

import com.example.demo.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    public List<Teacher> getAllTeachers(){
        List<Teacher> listTeachers = new ArrayList<>();
        listTeachers.add(new Teacher(1,"Juan"));
        listTeachers.add(new Teacher(2,"Lucas"));
        listTeachers.add(new Teacher(3,"Paco"));
        listTeachers.add(new Teacher(4,"Maria"));

        return listTeachers;
    }
}
