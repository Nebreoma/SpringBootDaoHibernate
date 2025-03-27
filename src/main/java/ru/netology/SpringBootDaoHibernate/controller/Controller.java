package ru.netology.SpringBootDaoHibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringBootDaoHibernate.model.Person;
import ru.netology.SpringBootDaoHibernate.service.Service;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return service.getPersons(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getAge(@RequestParam("age") int age) {
        return service.getAge(age);
    }

    @GetMapping("/persons/by-fullname")
    public Optional<Person> getNameSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return service.getNameSurname(name, surname);
    }
}