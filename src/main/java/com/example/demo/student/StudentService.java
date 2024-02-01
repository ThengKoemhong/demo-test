package com.example.demo.student;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    @GetMapping
    public List<Student> list(){
        return  List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam121@gmail.com",
                        LocalDate.of(2000, Month.AUGUST,5),
                        24
                ),
              new   Student(
                        2L,
                        "Mariam",
                        "mariam121@gmail.com",
                        LocalDate.of(2010, Month.AUGUST,5),
                        25
                )
        );
    }
}
