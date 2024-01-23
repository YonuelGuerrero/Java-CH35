package org.generation.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {

	public static void main(String[] args) {
		
//********* ARRAYS *******//
		
		String [] names = {"jonathan", "julio", "Gonzalo", "Fernanda", "Lizbeth", "Arturo"};
		//Imprimiendo Arrays
		System.out.println(Arrays.toString(names));
		
		int[] edades = {12, 3, 25, 55, 24, 34, 19, 30};
		System.out.println(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array
		String name1 = names[0];
		System.out.println("El primer nombre de la lista es " + name1);
		int edad1 = edades[2];
		System.out.println("La edad de " + name1 + " es " + edad1 + " anios");
		
		//Obtener longitud del Array
		int longitudNames = names.length;
		System.out.println("El Array names tiene " + longitudNames + " elementos");
		
		//Obtener ultimo elemento
		// String ultimoElemento = names[longitudNames -1]; //La longitud ya vive en la variable
		String ultimoElemento = names[names.length -1]; //La longitud no vive en una variable
		System.out.println("El ultimo elemento del Array names es " + ultimoElemento);
		
		//Mostrar cada elemento utilizando forEach
		for (String name:names) {
			System.out.println(name);
		}
		
		//****** ArrayList *********//
		
		//ArrayList es un Array que puede cambiar de tamanio, es la clase de java que representa la estructura de datos de Arrays. Permite elementos duplicados y recibe varios metodos para su mannipulacion 
		
		//Se inicializa el ArrayList
		ArrayList<String> films = new ArrayList<String>();
		ArrayList<Integer> matricula = new ArrayList<>(); //sintaxis simplificada
		
		//Agregar elementos 
		films.add("Inception");
		films.add("Se7en");
		films.add("The shining");
		films.add("Pulp finction");
		films.add("Mr Nobody");
		films.add("The shutter island");
		films.add("Ready player one");
		
		System.out.println(films);
		
		//Obtener un elemento: name.get(index)
		String film1 = films.get(0);
		System.out.println("La primer pelicula es: " + film1);
		
		//Modificar un elemento: name.set(index, newValue)
		String film3 = films.set(3,  "Memento");
		String film3Get = films.get(3);
		System.out.println(film3Get);
		
		//Conocer el tamanio del ArrayList: name.size();
		int sizeFilms = films.size();
		System.out.println("El tamanio del ArrayList es de: " + sizeFilms + " elementos");
		
		//Agregar un elemento y despues eliminarlo: name.remove(index);
		films.add("The fountain");
		System.out.println(films);
		
		films.remove(-1);
		System.out.println(films);
		
		//Mostrando los elementos en lista
		System.out.println("***Films en lista***");
		
		for (String film:films) {
			System.out.println(film);
		}
		
		
		
		
 	}

}
