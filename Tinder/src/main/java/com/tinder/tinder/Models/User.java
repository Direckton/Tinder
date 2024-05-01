package com.tinder.tinder.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    @Column(nullable = false, unique = true)
    private String email;
    private String name;
    private String password;
    private String gender;
    @Column(name = "birth_date")
    private Date birthDate;
    private int ageFilterMin;
    private int ageFilterMax;


    public User()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAgeFilterMin() {
        return ageFilterMin;
    }

    public void setAgeFilterMin(int ageFilterMin) {
        this.ageFilterMin = ageFilterMin;
    }

    public int getAgeFilterMax() {
        return ageFilterMax;
    }

    public void setAgeFilterMax(int ageFilterMax) {
        this.ageFilterMax = ageFilterMax;
    }
}
