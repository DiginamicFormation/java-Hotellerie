package com.example.jpa.database.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Chambre {
	
	@EmbeddedId
	private IdentifiantChambre id;

	@Column(name="prix")
	private double prix;

	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdentifiantChambre getId() {
		return id;
	}

	public void setId(IdentifiantChambre id) {
		this.id = id;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
