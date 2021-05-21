package com.github.psymboll.projectkyrurem.bl;

import java.util.List;

import com.github.psymboll.projectkyurem.model.entities.Generation;
import com.github.psymboll.projectkyurem.model.entities.Pokemon;
import com.github.psymboll.projectkyurem.model.entities.Type;

public interface PokeBL 
{

	List<Pokemon> findPokemonWithCriteria(Pokemon pokemon);
	List<Generation> findAllGenerations();
	List<Type> findAllTypes();
	
}
