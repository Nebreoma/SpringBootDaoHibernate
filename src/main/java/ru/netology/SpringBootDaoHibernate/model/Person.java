package ru.netology.SpringBootDaoHibernate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSONS", schema = "schema.sql")
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surname;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;

    public Person() {
    }

    public Person(String name, String surname, String phoneNumber, String cityOfLiving) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.cityOfLiving = cityOfLiving;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }
}