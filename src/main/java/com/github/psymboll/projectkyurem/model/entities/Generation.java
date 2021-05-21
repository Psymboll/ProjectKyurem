package com.github.psymboll.projectkyurem.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="generation")
@NamedQuery(name="findAllGenerations",query = "select g from Generation g" )
public class Generation 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int generationnumber;
	
	private String generationnumeral;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getGenerationnumber() 
	{
		return generationnumber;
	}

	public void setGenerationnumber(int generationnumber) 
	{
		this.generationnumber = generationnumber;
	}

	public String getGenerationnumeral() 
	{
		return generationnumeral;
	}

	public void setGenerationnumeral(String generationnumeral) 
	{
		this.generationnumeral = generationnumeral;
	}
	
	
	

}
