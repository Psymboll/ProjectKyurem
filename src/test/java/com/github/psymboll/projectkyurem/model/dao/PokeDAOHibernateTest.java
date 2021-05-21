package com.github.psymboll.projectkyurem.model.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.github.psymboll.projectkyurem.model.entities.PokePredicate;
import com.github.psymboll.projectkyurem.model.entities.Pokemon;

class PokeDAOHibernateTest 
{

	static PokeDAO dao;
	static Pokemon pk;
	static PokePredicate pr;
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		dao = new PokeDAOHibernate();
		pk = new Pokemon(0, 0, "", "", "", 0, 0, 0, 0, 0, 0, 0, 1, "");
		pr = new PokePredicate(pk);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
	}

	@Test
	void testSingleCriteriaTest() 
	{
		//no criteriatest
		List<Pokemon> test = new ArrayList<>(); 
				test=dao.findPokemonWithCriteria(pr);
				System.out.println(test);
		/*if(test.size()!=800)
		{	
			System.out.println(test.size());
		
			fail("did not count all the pokemons");
		}	*/
		//generationcriteriatest
		
		
		//test = dao.findPokemonWithCriteria(pk);
		if(test.size()!=166)
		{	
			System.out.println(test.size());
			System.out.println(test);
			fail("did find all gen 1 pokemon and megas");
		}	
		pk.setGeneration(0);
		/*
		//single type criteria test
		pk.setType1("Ghost");
		test = dao.findPokemonWithCriteria(pk);
		if(test.size()!=46)
		{	
			System.out.println(test.size());
			System.out.println(test);
			fail("did  not find all ghost types");
		}
		//doubletype criteria test
		pk.setType2("Poison");
		test = dao.findPokemonWithCriteria(pk);
		System.out.println(test);
		if(test.size() !=4)
		{
			System.out.println(test.size());
			System.out.println(test);
			fail("did find Gengar and its evolutionary family");
		}
		//totalstat test
		pk.setType1("");
		pk.setType2("");
		pk.setTotal(500);
		test = dao.findPokemonWithCriteria(pk);
		
		if(test.size() !=247)
		{
			System.out.println(test.size());
			System.out.println(test);
			fail("did find Gengar and its evolutionary family");
		}
		
		*/
	}
	@Test
	void testMultipleCriteria()
	{
		/*pk.setGeneration(4);
		pk.setType1("Grass");
		List<Pokemon> test = new ArrayList<>();
		test = dao.findPokemonWithCriteria(pk);
		System.out.println(test);
		if(test.size() !=17)
		{
			System.out.println(test.size());
			System.out.println(test);
			fail("did not find grass pokemon in gen 4");
		}
		*/
		
	}

}
