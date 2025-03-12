package br.com.dominio.service;

import br.com.dominio.model.Person;
import br.com.dominio.repository.PersonDAO;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PersonService {
    @Inject
    private PersonDAO personDAO;

    public void save(Person person) {
        personDAO.save(person);
    }

    public void delete(Person person) {
        personDAO.delete(person);
    }

    public List<Person> findAll() {
        return personDAO.findAll();
    }

    public Person findById(Long id) {
        return personDAO.findById(id);
    }
}