package br.com.dominio.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @NotBlank(message = "O número do documento é obrigatório")
    @Size(max = 45, message = "O número do documento deve ter no máximo 45 caracteres")
    private String nrDocument;

    @Size(max = 45, message = "O IP do documento deve ter no máximo 45 caracteres")
    private String ipDocument;

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

	public String getNrDocument() {
		return nrDocument;
	}

	public void setNrDocument(String nrDocument) {
		this.nrDocument = nrDocument;
	}

	public String getIpDocument() {
		return ipDocument;
	}

	public void setIpDocument(String ipDocument) {
		this.ipDocument = ipDocument;
	}

    
}