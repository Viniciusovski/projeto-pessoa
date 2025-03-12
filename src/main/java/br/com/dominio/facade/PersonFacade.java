package br.com.dominio.facade;

import br.com.dominio.dto.PersonDTO;
import br.com.dominio.model.Person;
import br.com.dominio.service.PersonService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PersonFacade {
    @Inject
    private PersonService personService;

    public void savePerson(PersonDTO personDTO) {
        Person person = toEntity(personDTO);
        personService.save(person);
    }

    public List<PersonDTO> findAllPersons() {
        return personService.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findPersonById(Long id) {
        Person person = personService.findById(id);
        return toDTO(person);
    }

    public void deletePerson(Long id) {
        Person person = personService.findById(id);
        if (person != null) {
            personService.delete(person);
        }
    }

    private Person toEntity(PersonDTO dto) {
        Person person = new Person();
        person.setId(dto.getId());
        person.setNmPerson(dto.getNome());
        person.setNmEmail(dto.getNmEmail());
        person.setNrTelephone(dto.getNrTelephone());
        
        return person;
    }

    private PersonDTO toDTO(Person person) {
        PersonDTO dto = new PersonDTO();
        dto.setId(person.getId());
        dto.setNome(person.getNmPerson());
        dto.setNmEmail(person.getNmEmail());
        dto.setNrTelephone(person.getNrTelephone());

        return dto;
    }
}