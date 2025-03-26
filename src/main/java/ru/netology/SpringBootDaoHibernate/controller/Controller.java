package ru.netology.SpringBootDaoHibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringBootDaoHibernate.model.Person;
import ru.netology.SpringBootDaoHibernate.service.Service;

import java.util.List;

@RestController
public class Controller {

    private Service service;

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam("city") String city) {
        return service.getPerson(city);
    }
}