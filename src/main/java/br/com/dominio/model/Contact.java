package br.com.dominio.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @NotBlank(message = "O nome do contato é obrigatório")
    @Size(max = 45, message = "O nome do contato deve ter no máximo 45 caracteres")
    private String nmContact;

    @Size(max = 45, message = "O telefone deve ter no máximo 45 caracteres")
    private String nrTelephone;

    @Size(max = 45, message = "O email deve ter no máximo 45 caracteres")
    private String nmEmail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getNmContact() {
		return nmContact;
	}

	public void setNmContact(String nmContact) {
		this.nmContact = nmContact;
	}

	public String getNrTelephone() {
		return nrTelephone;
	}

	public void setNrTelephone(String nrTelephone) {
		this.nrTelephone = nrTelephone;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

    
}