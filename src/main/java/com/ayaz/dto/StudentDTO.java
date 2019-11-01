package com.ayaz.dto;

import com.ayaz.validator.ValidDate;

import javax.validation.constraints.*;

public class StudentDTO {

    private int id;
    @NotBlank(message = "The Name cannot be left blank")
    @Size(min = 3,max = 30,message = "The Name is between character 3 and 30")
    private String name;
    @NotBlank(message = "The Surname cannot be left blank")
    @Size(min = 2,max = 30,message = "The Name is between character 3 and 30")
    private String surname;
    @Min(value = 18,message = "Age should be above 18")
    @Max(value = 100,message = "Age should be below 100")
    @NotBlank(message = "The Age cannot be left blank")
    private String age;
    @ValidDate(message = "The Date's format is not correct\n")
    @NotBlank(message ="The Birth day cannot be left blank")
    private String brithDate;
    @NotBlank(message ="The City's name cannot be left blank")
    @Size(min = 3,max = 50,message = "The City's name is between character 3 and 50")
    private String city;

    public StudentDTO() {
    }

    public StudentDTO(String name, String surname, String age, String brithDate, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.brithDate = brithDate;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(String brithDate) {
        this.brithDate = brithDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", brithDate='" + brithDate + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
