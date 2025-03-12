package br.com.dominio.repository;

import java.util.List;

import br.com.dominio.model.Person;

public interface PersonRepository {
    void save(Person person);
    void delete(Person person);
    List<Person> findAll();
    Person findById(Long id);
}