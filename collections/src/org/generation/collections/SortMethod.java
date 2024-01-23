package org.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethod {

	public static void main(String[] args) {
		//El metodo .sort() permite ordenar los elementos de un ArrayList
		ArrayList<Integer> points = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		
		points.add(5);
		points.add(7);
		points.add(6);
		points.add(10);
		points.add(7);
		points.add(8);
		
		System.out.println(points); //no se encuentran ordenados de menor a mayor 
		Collections.sort(points); //Se ordenan de menor a mayot
		System.out.println(points); //Se muestran ordenados
		
		//agregar nombres
		names.add("Daniel");
		names.add("Rocio");
		names.add("Arturo");
		names.add("Eveida");
		names.add("Fernanda");
		names.add("Angel");
		System.out.println(names); //No se encuentran ordenados
		
		Collections.sort(names); //Se ordenan A-Z
		
		System.out.println(names); //Se muestran ordenados 
		
		
		
	} //main

} //class
