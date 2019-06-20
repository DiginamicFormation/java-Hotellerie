package com.example.jpa.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Particulier extends AbstractClient {

	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;

	public Particulier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
