package br.com.dominio.dto;

import java.util.List;

public class PersonDTO {
	
    private Long id;
    private String nome;
    private String nmEmail;
    private String nrTelephone;
    private List<AddressDTO> enderecos;
    private List<DocumentDTO> documentos;
    private List<ContactDTO> contatos;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<AddressDTO> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<AddressDTO> enderecos) {
		this.enderecos = enderecos;
	}
	public List<DocumentDTO> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentDTO> documentos) {
		this.documentos = documentos;
	}
	public List<ContactDTO> getContatos() {
		return contatos;
	}
	public void setContatos(List<ContactDTO> contatos) {
		this.contatos = contatos;
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
	
	

    
    

    
}