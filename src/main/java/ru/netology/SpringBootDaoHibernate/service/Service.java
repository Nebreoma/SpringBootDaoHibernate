package ru.netology.SpringBootDaoHibernate.service;

import java.util.List;
import java.util.Optional;

import ru.netology.SpringBootDaoHibernate.model.Person;
import ru.netology.SpringBootDaoHibernate.repository.Repository;


public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersons(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getAge(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getNameSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}