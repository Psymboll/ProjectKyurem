package com.github.psymboll.projectkyurem.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.github.psymboll.projectkyurem.model.entities.Generation;
import com.github.psymboll.projectkyurem.model.entities.Type;
import com.github.psymboll.projectkyurem.util.EntityManagerUtil;

public interface PokeUtilDAO 
{

	

	List<Type> findAllTypes();
	List<Generation> findAllGenerations();
	
}
