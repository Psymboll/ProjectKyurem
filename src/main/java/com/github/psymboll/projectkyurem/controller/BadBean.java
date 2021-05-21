package com.github.psymboll.projectkyurem.controller;



import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.github.psymboll.projectkyrurem.bl.PokeBL;
import com.github.psymboll.projectkyrurem.bl.PokeBLHibernate;
import com.github.psymboll.projectkyurem.model.dao.PokeDAO;
import com.github.psymboll.projectkyurem.model.dao.PokeDAOHibernate;
import com.github.psymboll.projectkyurem.model.dao.PokeUtilDAO;
import com.github.psymboll.projectkyurem.model.dao.PokeUtilDAOHibernate;


@Component
public class BadBean 
{
	//TODO NOT TOO ELEGANT BUT IN THIS CASE IT'S NOT WORTH IT TO CREATE ANOTHER CLASS JUST TO DO THIS
	@Bean
	public PokeBL getPokeBL()
	{
		return new PokeBLHibernate(new PokeDAOHibernate(),new PokeUtilDAOHibernate());
	}

}
