package br.com.dominio.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @NotBlank(message = "O endereço é obrigatório")
    @Size(max = 500, message = "O endereço deve ter no máximo 500 caracteres")
    private String nmAddress;

    @Size(max = 10, message = "O número do endereço deve ter no máximo 10 caracteres")
    private String nrAddress;

    @NotBlank(message = "A cidade é obrigatória")
    @Size(max = 20, message = "A cidade deve ter no máximo 20 caracteres")
    private String nmCity;

    @NotBlank(message = "O estado é obrigatório")
    @Size(max = 20, message = "O estado deve ter no máximo 20 caracteres")
    private String nmState;

    @NotBlank(message = "O país é obrigatório")
    @Size(max = 20, message = "O país deve ter no máximo 20 caracteres")
    private String nmCountry;

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

	public String getNmAddress() {
		return nmAddress;
	}

	public void setNmAddress(String nmAddress) {
		this.nmAddress = nmAddress;
	}

	public String getNrAddress() {
		return nrAddress;
	}

	public void setNrAddress(String nrAddress) {
		this.nrAddress = nrAddress;
	}

	public String getNmCity() {
		return nmCity;
	}

	public void setNmCity(String nmCity) {
		this.nmCity = nmCity;
	}

	public String getNmState() {
		return nmState;
	}

	public void setNmState(String nmState) {
		this.nmState = nmState;
	}

	public String getNmCountry() {
		return nmCountry;
	}

	public void setNmCountry(String nmCountry) {
		this.nmCountry = nmCountry;
	}

    
}