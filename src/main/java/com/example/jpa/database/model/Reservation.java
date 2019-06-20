package com.example.jpa.database.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "numero_reservation")
	private int numeroReservation;
	
	@OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
	private List<ChambreReservation> chambres = new ArrayList<ChambreReservation>();


	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNumeroReservation() {
		return numeroReservation;
	}


	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}


	public List<ChambreReservation> getChambres() {
		return chambres;
	}


	public void setChambres(List<ChambreReservation> chambres) {
		this.chambres = chambres;
	}


	
	
	
}
