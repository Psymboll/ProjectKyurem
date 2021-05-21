package com.github.psymboll.projectkyurem.model.entities;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.criteria.CriteriaBuilder;

import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class PokePredicate 
{
	private List<Predicate> predicates = new ArrayList<>();
	private Pokemon pokemonForm;
	
	public List<Predicate> getPredicates() 
	{
		return predicates;
	}
	public void setPredicates(List<Predicate> predicates) 
	{
		this.predicates = predicates;
	}
	public Pokemon getPokemonForm() 
	{
		return pokemonForm;
	}
	public void setPokemonForm(Pokemon pokemonForm) 
	{
		this.pokemonForm = pokemonForm;
	}
	
	public PokePredicate(Pokemon pokemonForm) 
	{
		
		this.pokemonForm = pokemonForm;
	}
	
	
	
	public void assemblePredicates(CriteriaBuilder builder,Root<Pokemon> root)
	{
		
		
		
		// you should use parameters to prevent sql injection but it messes up if the parameter is not present
		//you decided not to use metatypes because it caused some unknown error, might reimplement them in the future
		if(pokemonForm.getGeneration()!=0)
			predicates.add(builder.equal(root.get("generation"),pokemonForm.getGeneration()));
		if(pokemonForm.getTotal()!=0)
			predicates.add(builder.greaterThanOrEqualTo(root.get("total"),pokemonForm.getTotal()));
		if(!pokemonForm.getType1().isBlank() && pokemonForm.getType2().isBlank())
			predicates.add(builder.or(
											builder.equal(root.get("type1"), pokemonForm.getType1()),
											builder.equal(root.get("type2"), pokemonForm.getType1())
										  ));
		else if(!(pokemonForm.getType1().isBlank() && pokemonForm.getType2().isBlank()))
			predicates.add(builder.and(
										 builder.or(
													 builder.equal(root.get("type1"), pokemonForm.getType1()),
													 builder.equal(root.get("type2"), pokemonForm.getType1())
											 		),
										 builder.or(
													 builder.equal(root.get("type1"), pokemonForm.getType2()),
													 builder.equal(root.get("type2"), pokemonForm.getType2())
												 	)
					
											
											));
		
		
		
	}
	
	public   Predicate[] listToArr()
	{
		 return predicates.toArray(new Predicate[predicates.size()]);		
	}
	
}
