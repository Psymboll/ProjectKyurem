package com.github.psymboll.projectkyrurem.bl;

import java.util.List;

import com.github.psymboll.projectkyurem.model.dao.PokeDAO;
import com.github.psymboll.projectkyurem.model.dao.PokeUtilDAO;
import com.github.psymboll.projectkyurem.model.entities.Generation;
import com.github.psymboll.projectkyurem.model.entities.PokePredicate;
import com.github.psymboll.projectkyurem.model.entities.Pokemon;
import com.github.psymboll.projectkyurem.model.entities.Type;

public class PokeBLHibernate implements PokeBL
{
	
	PokeDAO pokeDao;
	PokeUtilDAO utilDao;

	@Override
	public List<Pokemon> findPokemonWithCriteria(Pokemon pokemon) 
	{
		PokePredicate predicate = new PokePredicate(pokemon);
		
		List<Pokemon> result = pokeDao.findPokemonWithCriteria(predicate);
		return result;
	}

	@Override
	public List<Generation> findAllGenerations() 
	{
		
		return utilDao.findAllGenerations();
	}

	@Override
	public List<Type> findAllTypes() {
		// TODO Auto-generated method stub
		return utilDao.findAllTypes();
	}

	public PokeBLHibernate(PokeDAO pokeDao, PokeUtilDAO utilDao) 
	{
		super();
		this.pokeDao = pokeDao;
		this.utilDao = utilDao;
	}

	public PokeDAO getPokeDao() 
	{
		return pokeDao;
	}

	public void setPokeDao(PokeDAO pokeDao) 
	{
		this.pokeDao = pokeDao;
	}

	public PokeUtilDAO getUtilDao() 
	{
		return utilDao;
	}

	public void setUtilDao(PokeUtilDAO utilDao) 
	{
		this.utilDao = utilDao;
	}

}
