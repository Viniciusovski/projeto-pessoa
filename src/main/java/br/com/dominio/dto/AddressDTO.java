package br.com.dominio.dto;

public class AddressDTO {
    private Integer id;
    private String nmAddress;
    private String nrAddress;
    private String nmCity;
    private String nmState;
    private String nmCountry;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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