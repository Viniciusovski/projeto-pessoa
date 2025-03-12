package br.com.dominio.repository;

import br.com.dominio.model.Person;
import java.util.List;

public interface PersonDAO {
    void save(Person person);
    void delete(Person person);
    List<Person> findAll();
    Person findById(Long id);
}