package br.com.dominio.dto;

public class ContactDTO {
    private Integer id;
    private String nmContact;
    private String nrTelephone;
    private String nmEmail;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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