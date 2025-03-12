package br.com.dominio.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.dominio.model.Person;

import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Person person) {
        if (person.getId() == null) {
            em.persist(person);
        } else {
            em.merge(person);
        }
    }

    @Override
    public void delete(Person person) {
        em.remove(em.merge(person));
    }

    @Override
    public List<Person> findAll() {
        return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
    }

    @Override
    public Person findById(Long id) {
        return em.find(Person.class, id);
    }
}