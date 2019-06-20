package com.example.jpa.database.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private String rue;
	private String ville;
	
	@Column(name = "code_postal")
	private String codePostal;
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	

	
	

}
