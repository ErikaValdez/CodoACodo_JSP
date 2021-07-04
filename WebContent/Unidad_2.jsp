<%@page import="modelo.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		 <h1>Codo a Codo Unidad_2 </h1>

  


	<%         
	
			Persona person = new Persona("Erika","Valdez",26,"Leer","Windows","Eclipse");
		
			System.out.println(person);             
				
			String mensaje = new String ("<p>Nombre:</p>"+person.getNombre()+"<p>Apellido:</p>"+person.getApellido()+"<p>Edad:</p>"+person.getEdad()+"<p>Hobbie:</p>"+person.getHobbie()+"<p>Sistema Operativo:</p>"+person.getSistemaOperativo()+"<p>Editor de codigo:</p>"+person.getEditorCodigo());
			out.print(mensaje);
				%>
</body>
</html>