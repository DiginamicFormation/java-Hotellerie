package com.example.jpa.database.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity(name="reservation")
public class Reservation {

	@Id
	@Column(name = "id_reservation")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "numero_reservation")
	private int numeroReservation;
	
	@ManyToMany
	@JoinTable(name="reservation_chambre", 
		joinColumns= @JoinColumn(name="id_reservation", referencedColumnName="id_reservation"),
		inverseJoinColumns= @JoinColumn(name="id_chambre", referencedColumnName="id_chambre")
    )
    private Set<Chambre> chambres;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	public Set<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(Set<Chambre> chambres) {
		this.chambres = chambres;
	}
	
	
}
