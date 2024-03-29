package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @SequenceGenerator(
            name =  "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private  long id;
    private  String name;
    private  String email;
    private LocalDate dob;
    private  Integer age;
    public  Student(){

    }
    public  Student(long id,String name,String email,LocalDate dob,Integer age){
        this.id = id;
        this.name = name;
        this.email=email;
        this.dob = dob;
        this.age = age;

    }
    public  Student(String name,String email,LocalDate dob,Integer age){

        this.name = name;
        this.email=email;
        this.dob = dob;
        this.age = age;
    }
    public Long getId(){
        return id;
    }
    public  String getName(){
        return  name;
    }
    public  String getEmail(){
        return  email;
    }
    public  LocalDate getDob(){
        return  dob;
    }
    public Integer getAge(){
        return  age;
    }
    public  void  setId(long id){
        this.id = id;
    }
    public  void  setName(String name){
        this.name = name;
    }
    public  void  setEmail(String email){
        this.email = email;
    }
    public  void  setDob(LocalDate dob){
        this.dob = dob;
    }
    public  void  setAge(Integer age){
        this.age = age;
    }
    @Override
    public  String toString(){
        return  "Student{"+"ID = "+id+" ,NAME = "+name+", EMAIL = "+email+", DOB = "+dob+", AGE = "+age+"}";
    }
}
