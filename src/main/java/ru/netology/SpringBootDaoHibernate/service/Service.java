package ru.netology.SpringBootDaoHibernate.service;

import java.util.List;

import ru.netology.SpringBootDaoHibernate.model.Person;
import ru.netology.SpringBootDaoHibernate.repository.Repository;


public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPerson(String city) {
        return repository.getPersonsByCity(city);
    }
}
