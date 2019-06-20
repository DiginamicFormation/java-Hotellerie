package com.example.jpa.database.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChambreReservationId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "chambre_id")
	private long chambreId;
	
	@Column(name= "reservation_id")
	private long reservationId;

	public ChambreReservationId() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public long getChambreId() {
		return chambreId;
	}



	public void setChambreId(long chambreId) {
		this.chambreId = chambreId;
	}



	public long getReservationId() {
		return reservationId;
	}



	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}



	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (chambreId ^ (chambreId >>> 32));
		result = prime * result + (int) (reservationId ^ (reservationId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChambreReservationId other = (ChambreReservationId) obj;
		if (chambreId != other.chambreId)
			return false;
		if (reservationId != other.reservationId)
			return false;
		return true;
	}
	
	

}
