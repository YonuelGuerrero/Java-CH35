package org.generation.letras;

import java.util.Scanner;

/*
 * Crear un programa que le solicite un mensaje al usuario y cuente cuantas vocales, consonantes, numeros y simbolos posee dicho mensaje.
 * 	
 * 	Letras: metodos para interactuar con el usuario
 * 	LetrasMain: vamos a instanciar los objetos
 * 	contador: metodos para contar vocales, consonantes, numeros y simbolos
 */

public class Letras {
	//Para que nuestro usuario interactue, definimos un scanner y lo importamos
	Scanner scanner = new Scanner (System.in);
	
	//Metemos el Scanner dentro de un metodo
	public String leerEntrada() {
		return scanner.nextLine();
	}
	
	//Metodo para proporcionar contexto al usuario
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	

}
