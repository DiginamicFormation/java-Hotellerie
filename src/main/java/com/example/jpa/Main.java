package com.example.jpa;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

import com.example.jpa.database.DatabaseHandle;
import com.example.jpa.database.model.Entreprise;
import com.example.jpa.database.model.Particulier;

public class Main {
	
	public static void main(String[] args) {

		
		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		
		
		// Get a transaction
		EntityTransaction transaction = em.getTransaction();
		
		// Begin the transaction
		transaction.begin();
		
		
		Entreprise e = new Entreprise(); // création d’une entreprise
		e.setNomSocial("CIE AND CO");
		e.setSiret("0123456789012");
		e.setMail("entreprise@pro.com");
		em.persist(e);
		
		Particulier p = new Particulier(); // création d’un particulier
		p.setNom("Durant");
		p.setPrenom("Cédric");
		p.setMail("particulier@perso.fr");
		em.persist(p);
		
		// commit data
		transaction.commit();
		
		System.out.println("ID entreprise => " + e.getId());
		System.out.println("ID personne => " + p.getId());
				
		em.close();
		
		System.exit(0);
		
	}

	
}
