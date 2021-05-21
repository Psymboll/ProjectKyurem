package com.github.psymboll.projectkyurem.model.dao;

import java.util.List;

import com.github.psymboll.projectkyurem.model.entities.PokePredicate;
import com.github.psymboll.projectkyurem.model.entities.Pokemon;

public interface PokeDAO 
{

	List<Pokemon> findPokemonWithCriteria(PokePredicate predicate);
}
