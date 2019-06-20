package com.example.jpa.database.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="chambre")
public class Chambre {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "numero_chambre")
	private int numeroChambre;
	
	@ManyToOne
	@JoinColumn(name="id_hotel")
	private Hotel hotel;
	
	@OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
	private List<ChambreReservation> reservations = new ArrayList<ChambreReservation>();

	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroChambre() {
		return numeroChambre;
	}

	public void setNumeroChambre(int numeroChambre) {
		this.numeroChambre = numeroChambre;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<ChambreReservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<ChambreReservation> reservations) {
		this.reservations = reservations;
	}

	
	

}
