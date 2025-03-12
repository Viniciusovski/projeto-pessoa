package br.com.dominio.repository;

import br.com.dominio.model.Person;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PersonDAOImpl implements PersonDAO {
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