package com.example.jpa;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

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
		
		
		p = new Personne();
		
		p.setNom("BOND");
		p.setPrenom("Allan");
		p.setDateNaissance(LocalDate.now());
		em.persist(p);
			
		TypedQuery<Personne> query = em.createQuery("SELECT p FROM Personne p WHERE nom = :nom", Personne.class);
		query.setParameter("nom", "DOE");
		
		p = query.getSingleResult();
		System.out.println(p.toString());
		
		// commit data
		transaction.commit();
				
				
		em.close();
		System.exit(0);
	}

	
}
