package com.example.jpa.database.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class IdentifiantChambre implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int numero;
	private int etage;
	
	public IdentifiantChambre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + etage;
		result = prime * result + numero;
		return result;
	}

	
	

}
