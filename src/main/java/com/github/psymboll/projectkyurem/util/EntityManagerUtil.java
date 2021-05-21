package com.github.psymboll.projectkyurem.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil 
{
	private static EntityManagerUtil instance = null;
	
	public static synchronized EntityManagerUtil getInstance()
	{
		if(instance==null)
			instance = new EntityManagerUtil();
		return instance;
	}
	
	private EntityManager em;

	private EntityManagerUtil()
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ProjectKyurem");
		EntityManager em = emfactory.createEntityManager();
		this.em = em;
	}
	
	public EntityManager getEm() 
	{
		return em;
	}

	public void setEm(EntityManager em) 
	{
		this.em = em;
	}
}
