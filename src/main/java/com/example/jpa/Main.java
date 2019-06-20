package com.example.jpa;

import javax.persistence.EntityManager;


import javax.persistence.EntityTransaction;

import com.example.jpa.database.DatabaseHandle;
import com.example.jpa.database.model.Chambre;
import com.example.jpa.database.model.IdentifiantChambre;

public class Main {
	
	public static void main(String[] args) {

		
		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		
		
		// Get a transaction
		EntityTransaction transaction = em.getTransaction();
		
		// Begin the transaction
		transaction.begin();
		
		
		IdentifiantChambre ic = new IdentifiantChambre();
		ic.setEtage(2);
		ic.setNumero(14);
		
		Chambre c = new Chambre();
		c.setId(ic);
		c.setPrix(138.00);
		
		em.persist(c);
		
		
		// commit data
		transaction.commit();
		
				
		em.close();
		
		System.exit(0);
		
	}

	
}
