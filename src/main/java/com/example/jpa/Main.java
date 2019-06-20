package com.example.jpa;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.jpa.database.DatabaseHandle;
import com.example.jpa.database.model.Personne;

public class Main {
	
	public static void main(String[] args) {

		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		
		// Get a transaction
		EntityTransaction transaction = em.getTransaction();
		
		// Begin the transaction
		transaction.begin();
		
		Personne p = new Personne();
		
		p.setNom("DOE");
		p.setPrenom("John");
		p.setDateNaissance(LocalDate.now());
		em.persist(p);
		
		
			
		// the id is read
		int id = p.getId();
		System.out.println("ID => " + id);
		
		// the record is read
		Personne p2 = em.find(Personne.class, 1);
		System.out.println(p2.toString());
		
		
		// the record is modified
		p2.setPrenom("Johnny");
		
		// commit data
		transaction.commit();
				
				
		em.close();
		System.exit(0);
	}

	
}
