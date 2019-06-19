package com.example.jpa.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class Personne {
	@Id
	private Integer id;
	@Column(name = "nom", length = 30, nullable = false, unique = true)
	private String nom;
	@Column(name = "prenom", length = 30, nullable = false)
	private String prenom;

	// constructeurs
	public Personne() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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