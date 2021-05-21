package com.github.psymboll.projectkyurem.model.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.github.psymboll.projectkyurem.model.entities.Generation;
import com.github.psymboll.projectkyurem.model.entities.Type;

class PokeUtilDAOHibernateTest {

	static PokeUtilDAO dao;
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		dao = new PokeUtilDAOHibernate();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
	}

	@Test
	void testFindAllTypes() 
	{
		List<Type> types = dao.findAllTypes();
		System.out.println(types);
		
		if(types.size()!=18)
		{
			System.out.println(types.size());
			fail("Not yet implemented");
		}	
	}

	@Test
	void testFindAllGenerations() 
	{
		List<Generation> gens = dao.findAllGenerations();
		System.out.println(gens);
		
		if(gens.size()!=6)
		{
			System.out.println(gens.size());
			fail("Not yet implemented");
		}	
	}
}
