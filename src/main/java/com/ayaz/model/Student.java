package com.ayaz.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name",length = 40)
    private String name;
    @Column(name = "surname",length = 40)
    private String surname;
    @Column(name = "age")
    private int age;
    @Temporal(TemporalType.DATE)
    private Date brithDate;
    @Column(name = "city")
    private String city;

    public Student() {
    }

    public Student(String name, String surname, int age, Date brithDate,String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.brithDate=brithDate;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(Date brithDate) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", brithDate=" + brithDate +
                ", city='" + city + '\'' +
                '}';
    }
}
