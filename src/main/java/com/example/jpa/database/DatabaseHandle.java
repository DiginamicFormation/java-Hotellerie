package com.example.jpa.database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseHandle {

	// Create an EntityManagerFactory when you start the application.
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY;
	
	public static EntityManagerFactory getEntityManagerFactory()
	{
		if (ENTITY_MANAGER_FACTORY == null)
		{
			ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("jpa_test");
		}
		
		return ENTITY_MANAGER_FACTORY;
	}
	
	

}
