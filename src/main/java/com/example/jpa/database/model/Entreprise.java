package com.example.jpa.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Entreprise extends AbstractClient {
	
	@Column(name="nom_social")
	private String nomSocial;
	
	@Column(name="siret")
	private String siret;

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNomSocial() {
		return nomSocial;
	}

	public void setNomSocial(String nomSocial) {
		this.nomSocial = nomSocial;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}
	
	

}
