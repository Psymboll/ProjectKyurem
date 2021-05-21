<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!--  all the css needs to be transfered in the right file when you get how to do it  grey=color:#aaaaaa -->
<style>
body, html 
{
  height: 100%;
}
.pokelabel
{

text-align:center;
padding-left:75px;
 color:#aaaaaa;
}
#searchlegend
{

text-align:center;
 color:#aaaaaa;
  padding-top:75px;
   font-size:20px;
   

}
#mainpagetitle
{
text-align:center; 
color:#B0CED6;
font-size:75px;
 font-weight:bold;

}
 /* no idea what this style does the button css is a mystery to me */
#searchbutton
{
margin-top: auto
;padding: .375rem 11.8rem !important;
background-color:#B0CED6;color:#808080

}

</style>

<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">


<title>Project Kyurem</title>
</head>
<body>
<div class="header container bg-warning" style="text-align:left"> <a href="fuffa">fuffa</a> </div>
<div  class = "bg" style = "background-image: url('https://wallpapercave.com/wp/wp1881080.jpg');
height: 100%;  background-repeat: no-repeat;
background-size: cover;" >

	<div class="row">
		<div  id="mainpagetitle" class="col-4" style = "">
		Project Kyurem
	 	</div>
		<div class = "col-4"></div>
		<div class = "col-4"></div>
	</div>	
	<div class ="row">
		<div class = "col-4">
		<!--TODO  study css a bit and clean this mess -->
		<form:form action="search" modelAttribute="pokemonForm">
			<fieldset>
			
				<legend id="searchlegend" ><b>Find the pokemons you want with our search engine</b></legend>
					<div class="row g-3 align-items-center"  >
						<div class="col-5">
							<label for="insertfirsttype" class="pokelabel col-form-label" ><b>Primary Type</b></label>
						</div>
						<div class="col-5">
							<form:select class="form-control" id="insertfirsttype" path="type1" type = "text">
								<option value="">Select a Type</option>
								<c:forEach items="${types }" var="type">
						  	  		<option value="${type.type}"> ${type.type} </option>
						  	  	</c:forEach>
							</form:select>
						</div>	
						<div class="col-2"></div>
					</div>
					<div class="row g-3 align-items-center"  >
						<div class="col-5">
							<label for="insertsecondtype" class="pokelabel col-form-label" ><b>Secondary Type</b></label>
						</div>	
							<div class="col-5">
								<form:select class="form-control" id="insertsecondtype" path="type2" type="text">
									<option value="">Select a Type</option>
									<c:forEach items="${types }" var="type">
									  	<option value="${type.type}"> ${type.type} </option>
									</c:forEach>
								</form:select>
							</div>	
						<div class="col-2"></div>
					</div>	
				 <div class ="row g-3 align-items-center">
					 <div class="col-5">
						<label for="insertstats" class="pokelabel col-form-label"><b>Total BST </b></label>
					 </div>
					 <div class="col-5">
					 	<form:input class="form-control" id="inserstats" path="total" type="numeric"/>
				 	 </div>
				 	 <div class="col-2"></div>
				 
				 </div>	
				 <!--TODO change this to a select from a database table with generation number and roman equivalent -->
				 <div class ="row g-3 align-items-center">
					 <div class="searchrow col-5">
						<label for="insertgeneration" class="pokelabel col-form-label" ><b>Generation </b></label>
					 </div>
					 <div class="col-5">
					 	<form:select class="form-control" id="insertgeneration" path="generation" type="text">
							<option value="0">Select a Generation</option>
							<c:forEach items="${generations}" var="generation">
							  	<option value="${generation.generationnumber}"> ${generation.generationnumeral} </option>
							</c:forEach>
						</form:select>
				 	 </div>
				 	 
				 	 
				 	 <div class="col-2"></div>
				 
				 </div>	
				
				 <div  align="center">
					<button type="submit" class="btn-lg"   id="searchbutton" >
						Search
					</button>
					<span style="padding-left:43px"></span>
				</div>
				
				
				
				
			</fieldset>
		</form:form>
		
		</div>
		<div class = "col-4"></div>
		<div class = "col-4"></div>
	</div>	

</div>




<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


</body>
</html>