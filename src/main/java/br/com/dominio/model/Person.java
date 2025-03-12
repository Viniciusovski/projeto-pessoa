package br.com.dominio.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da pessoa é obrigatório")
    @Size(max = 200, message = "O nome da pessoa deve ter no máximo 200 caracteres")
    private String nmPerson;

    @Size(max = 2, message = "O TP da pessoa deve ter no máximo 2 caracteres")
    private String tpPerson;

    @Size(max = 200, message = "O email deve ter no máximo 200 caracteres")
    private String nmEmail;

    @Size(max = 200, message = "O telefone deve ter no máximo 200 caracteres")
    private String nrTelephone;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Document> documents;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contact> contacts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmPerson() {
		return nmPerson;
	}

	public void setNmPerson(String nmPerson) {
		this.nmPerson = nmPerson;
	}

	public String getIpPerson() {
		return tpPerson;
	}

	public void setIpPerson(String ipPerson) {
		this.tpPerson = ipPerson;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public String getNrTelephone() {
		return nrTelephone;
	}

	public void setNrTelephone(String nrTelephone) {
		this.nrTelephone = nrTelephone;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

    
}