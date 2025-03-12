package br.com.dominio.controller;

import br.com.dominio.model.Person;
import br.com.dominio.service.PersonService;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class PersonBean implements Serializable {
    private Person person;
    private List<Person> persons;

    @Inject
    private PersonService personService;

    @PostConstruct
    public void init() {
        person = new Person();
        persons = personService.findAll();
    }

    public void save() {
        personService.save(person);
        person = new Person();
        persons = personService.findAll();
    }

    public void delete(Person person) {
        personService.delete(person);
        persons = personService.findAll();
    }

    public void edit(Person person) {
        this.person = person;
    }

    // Getters e Setters
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}