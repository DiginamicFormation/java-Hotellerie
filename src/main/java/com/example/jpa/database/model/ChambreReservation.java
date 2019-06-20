package com.example.jpa.database.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "chambre_reservation")
public class ChambreReservation {

	@EmbeddedId
	private ChambreReservationId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("chambreId")
	private Chambre chambre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("reservationId")
	private Reservation reservation;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="prix")
	private float prix;
	
	

	public ChambreReservation() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ChambreReservationId getId() {
		return id;
	}



	public void setId(ChambreReservationId id) {
		this.id = id;
	}



	public Chambre getChambre() {
		return chambre;
	}



	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}



	public Reservation getReservation() {
		return reservation;
	}



	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public float getPrix() {
		return prix;
	}



	public void setPrix(float prix) {
		this.prix = prix;
	}

	
	
	
	
}
