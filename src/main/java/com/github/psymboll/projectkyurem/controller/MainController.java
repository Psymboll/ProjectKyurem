package com.github.psymboll.projectkyurem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.psymboll.projectkyrurem.bl.PokeBL;
import com.github.psymboll.projectkyurem.model.dao.PokeDAO;
import com.github.psymboll.projectkyurem.model.dao.PokeUtilDAO;
import com.github.psymboll.projectkyurem.model.entities.Generation;
import com.github.psymboll.projectkyurem.model.entities.Pokemon;
import com.github.psymboll.projectkyurem.model.entities.Type;

@Controller
public class MainController 
{
	@Autowired
	PokeBL bl;
	
	
	
	@ModelAttribute("types")
	public List<Type> pokemonTypes()
	{
		return bl.findAllTypes();
	}
	
	@ModelAttribute("generations")
	public List<Generation> generations()
	{
		return bl.findAllGenerations();
	}
	
	
	@RequestMapping(value = {"","/","mainpage"})
	public String mainPage(@ModelAttribute("pokemonForm") Pokemon pokemon)
	{
		
		return "mainpage";
	}
	
	@RequestMapping("search")
	public String searchPage(@ModelAttribute("pokemonForm") Pokemon pokemon,Model model)
	{
		List<Pokemon> pokemonList = bl.findPokemonWithCriteria(pokemon);
		model.addAttribute("pokemonList",pokemonList);
		return "pokemonlist";
	}
	
	
	
}
