package com.github.psymboll.projectkyurem.model.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;





@Entity
@Table(name="pokemon")
@NamedQuery(name="findAll",query = "select p from Pokemon p" )
public class Pokemon 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private int pokedexNumber;
	

	private String name;
	

	private String type1;
	
	private String type2;
	
	
	private int total;
	
	
	private int hp;
	

	private int attack;
	
	
	private int defense;
	
	
	private int specialAttack;
	

	private int specialDefense;
	

	private int speed;
	
	


	private int generation;

	private String legendary;
	

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getPokedexNumber() 
	{
		return pokedexNumber;
	}

	public void setPokedexNumber(int pokedexNumber) 
	{
		this.pokedexNumber = pokedexNumber;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getType1() 
	{
		return type1;
	}

	public void setType1(String type1) 
	{
		this.type1 = type1;
	}

	public String getType2() 
	{
		return type2;
	}

	public void setType2(String type2) 
	{
		this.type2 = type2;
	}

	public int getTotal() 
	{
		return total;
	}

	public void setTotal(int total) 
	{
		this.total = total;
	}

	public int getHp() 
	{
		return hp;
	}

	public void setHp(int hp) 
	{
		this.hp = hp;
	}

	public int getAttack() 
	{
		return attack;
	}

	public void setAttack(int attack) 
	{
		this.attack = attack;
	}

	public int getDefense() 
	{
		return defense;
	}

	public void setDefense(int defense) 
	{
		this.defense = defense;
	}

	public int getSpecialAttack() 
	{
		return specialAttack;
	}

	public void setSpecialAttack(int specialAttack) 
	{
		this.specialAttack = specialAttack;
	}

	public int getSpecialDefense() 
	{
		return specialDefense;
	}

	public void setSpecialDefense(int specialDefense) 
	{
		this.specialDefense = specialDefense;
	}

	public int getSpeed() 
	{
		return speed;
	}

	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}

	public int getGeneration() 
	{
		return generation;
	}

	public void setGeneration(int generation) 
	{
		this.generation = generation;
	}

	public String getLegendary() 
	{
		return legendary;
	}

	public void setLegendary(String legendary) 
	{
		this.legendary = legendary;
	}

	@Override
	public String toString() 
	{
		return "pokedexNumber=" + pokedexNumber + ", name=" + name + ", type1=" + type1
				+ ", type2=" + type2 + ", total=" + total + ", generation=" + generation + ", legendary=" + legendary + "\n";
	}
	
	
	
	public Pokemon () {}

	//just for test purposes, to remove later
	public Pokemon(int id, int pokedexNumber, String name, String type1, String type2, int total, int hp, int attack,
			int defense, int specialAttack, int specialDefense, int speed, int generation, String legendary) {
		super();
		this.id = id;
		this.pokedexNumber = pokedexNumber;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.total = total;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
		this.generation = generation;
		this.legendary = legendary;
	}
	
}
