package ru.netology.SpringBootDaoHibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.SpringBootDaoHibernate.model.Person;

import java.util.List;

public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Person p where p.cityOfLiving = :city order by p.cityOfLiving", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
