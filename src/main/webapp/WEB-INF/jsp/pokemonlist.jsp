<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
#searchpagetitle
{
	text-align:center; 
	color:#B0CED6;
	font-size:75px;
 	font-weight:bold;
 	

}
.tablehead
{
border-style : solid;
border-width : 5px;
border-color : #B0CED6;
text-align:center;
color:#808080


}
.tableres
{


 border-top-style: hidden;
  border-right-style: hidden;
  border-bottom-style: solid;
  border-left-style: hidden;

border-width : 5px;
border-color : #B0CED6;
text-align:center;
color:#808080

}
#poketablecontainer
{
padding-top : 50px;
}
</style>
<meta charset="ISO-8859-1">
<title>Search Results</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div id="searchpagetitle" > <h1>  Here are your results</h1> </div>
	<div id="poketablecontainer" class = "container">
	<table class="table" id="poketable">
		<thead>
			<tr>
				<th class=" tablehead" scope="col">Dex Number</th>
				<th class=" tablehead" scope="col">Generation</th>	
				<th class=" tablehead" scope="col">Name</th>
				<th class=" tablehead" scope="col">Type 1</th>
				<th class=" tablehead" scope="col">Type 2</th>
				<th class=" tablehead" scope="col">Total BST</th>
				<th class=" tablehead" scope="col">HP</th>
				<th class=" tablehead" scope="col">Attack</th>
				<th class="tablehead" scope="col">Defense</th>
				<th class=" tablehead" scope="col">Sp. Attack</th>
				<th class=" tablehead" scope="col">Sp. Defense</th>
				<th class=" tablehead" scope="col">Speed</th>
			</tr>
		</thead>


<c:forEach items="${pokemonList}" var="pokemon">
	<tbody>
	<tr>
		<td class="tableres">${pokemon.pokedexNumber }</td>
		<td class="tableres" >${pokemon.generation }</td>
		<td class="tableres"  >${pokemon.name } </td>
		<td class="tableres" >${pokemon.type1 }</td>
		<td class="tableres" >${pokemon.type2 }</td>
		<td class="tableres" > ${pokemon.total }</td>
		<td class="tableres" > ${pokemon.hp }</td>	
		<td class="tableres"  >${pokemon.attack }</td>
		<td class="tableres" >${pokemon.defense }</td>
		<td class="tableres"  >${pokemon.specialAttack }</td>
		<td class="tableres">${pokemon.specialDefense }</td>
		<td class="tableres" >${pokemon.speed }</td>
		</tr>
	</tbody>
	
</c:forEach>
</table>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>