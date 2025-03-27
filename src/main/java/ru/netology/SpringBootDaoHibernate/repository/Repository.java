package ru.netology.SpringBootDaoHibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.SpringBootDaoHibernate.model.Person;
import ru.netology.SpringBootDaoHibernate.model.PersonId;

import java.util.List;
import java.util.Optional;

public interface Repository extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
