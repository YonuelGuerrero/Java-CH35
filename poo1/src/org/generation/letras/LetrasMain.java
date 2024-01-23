package org.generation.letras;

public class LetrasMain {
	public static void main(String[] args) {
		//Instanciar los objetos (Letras y contador)
		Letras letras =  new Letras();
		letras.mostrarMensaje("Escribe un texto y te mostrare el numero de vocales, consonantes, simbolos y numeros");
		String palabra = letras.leerEntrada(); //Guardamos el texto introducido por el usuario en una variable 
		
		//Invocar los metodos que me permiten contar los caracteres 
		Contador contador = new Contador();
		
		int totalVocales = contador.contarVocales(palabra);
		System.out.println("Hay " + totalVocales + " vocales");
		
		int totalConsonantes = contador.contarConsonantes(palabra);
		System.out.println("Hay " + totalConsonantes + " Consonantes");
		
		int totalSimbolos = contador.contarSimbolos(palabra);
		System.out.println("Hay " + totalSimbolos + " Simbolos");
		
		int totalNumeros = contador.contarNumeros(palabra);
		System.out.println("Hay " + totalNumeros + " Numeros");
		
		
		
		
		
	}//main

} //class
