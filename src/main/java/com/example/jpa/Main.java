package com.example.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.jpa.database.DatabaseHandle;
import com.example.jpa.database.model.Chambre;
import com.example.jpa.database.model.Hotel;

public class Main {
	
	public static void main(String[] args) {

		
		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		
		
		// Get a transaction
		EntityTransaction transaction = em.getTransaction();
		
		// Begin the transaction
		transaction.begin();
		
		
		Hotel hotel = new Hotel();
		hotel.setNom("Les flots bleus");
		
		Chambre chambre = new Chambre();
		chambre.setNumeroChambre(108);
		chambre.setHotel(hotel);
		
		em.persist(hotel);
		em.persist(chambre);
		
		
		// commit data
		transaction.commit();
				
		em.close();
		
		System.exit(0);
		
	}

	
}
