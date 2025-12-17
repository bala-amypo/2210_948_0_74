package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class StudentEntity{

    @Id 
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message="Name is not valid")
    private String name;

    @Email(message = "Email format is not valid")
    private String email;

    public void setId(Long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String name(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String email(){
        return email;
    }
    public StudentEntity(){

    }
    public StudentEntity(long id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

}