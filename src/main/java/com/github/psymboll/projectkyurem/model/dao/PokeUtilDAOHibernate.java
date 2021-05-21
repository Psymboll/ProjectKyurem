package com.github.psymboll.projectkyurem.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.github.psymboll.projectkyurem.model.entities.Generation;
import com.github.psymboll.projectkyurem.model.entities.Type;
import com.github.psymboll.projectkyurem.util.EntityManagerUtil;

public class PokeUtilDAOHibernate implements PokeUtilDAO
{
	EntityManager em;
	
	public PokeUtilDAOHibernate()
	{
		em = EntityManagerUtil.getInstance().getEm();
	}
	
	
	@Override
	public List<Type> findAllTypes() 
	{
		
		return em.createNamedQuery("findAllTypes", Type.class).getResultList();
	}


	@Override
	public List<Generation> findAllGenerations() 
	{
		
		 return em.createNamedQuery("findAllGenerations", Generation.class).getResultList();
	}

}
