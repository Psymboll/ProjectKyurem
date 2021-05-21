package com.github.psymboll.projectkyurem.model.dao;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import javax.persistence.criteria.Root;


import com.github.psymboll.projectkyurem.model.entities.PokePredicate;
import com.github.psymboll.projectkyurem.model.entities.Pokemon;

import com.github.psymboll.projectkyurem.util.EntityManagerUtil;

public class PokeDAOHibernate implements PokeDAO
{
	EntityManager em;
	
	public PokeDAOHibernate()
	{
		em = EntityManagerUtil.getInstance().getEm();
	}
	
	
	@Override
	public List<Pokemon> findPokemonWithCriteria(PokePredicate predicate) 
	{
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Pokemon> criteria = builder.createQuery(Pokemon.class);
		Root<Pokemon> root = criteria.from(Pokemon.class);
		
		predicate.assemblePredicates(builder,root);
		
		criteria.select(root).where(predicate.listToArr());
		 List <Pokemon>  pokemons =em.createQuery(criteria).getResultList();
		
		
 		return pokemons;
	}

}
