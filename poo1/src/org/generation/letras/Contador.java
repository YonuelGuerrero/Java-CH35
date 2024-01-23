package org.generation.letras;
/*
 * Contador: metodos para contar vocales, consonantes, numero y simbolos
 * Necesitamos establecer dos grupos de metodos:
 * 	Grupo1: metodos boolean para determinar a que tipo de metodo corresponde
 * 	Grupo2: metodos que van a devolver el conteo de dichos caracteres
 */

public class Contador {
	//Grupo1
	public boolean esVocal(char caracter) {
		return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u');
	}
	public boolean esNumero(char caracter) {
		//Casting para poder usar la tabla ASCII(48-57)
		short codigoAscii = (short)caracter;
		return codigoAscii >= 48 && codigoAscii <=  57;
	}
	public boolean esConsonante(char caracter) {
		//Casting para poder utilizar la tabla ascii (65-90) y (97-122), con excepcion de vocales(!)
		short codigoAscii = (short) caracter;
		return ((codigoAscii >= 65 && codigoAscii <= 90) || (codigoAscii >= 97 && codigoAscii <= 122)) && !esVocal(caracter);
	}
	public boolean esSimbolo(char caracter) {
		return !(esVocal(caracter) || esNumero(caracter) || esConsonante(caracter));
	}
	
	
	//Grupo2
	
		//Metodo para contar vocales
	public int contarVocales(String palabra) {
		int vocales = 0;
		for (char caracter : palabra.toCharArray() ) {
			if(esVocal(caracter)) {
				vocales ++;
			}
		}
		return vocales;
	}
	
	//Metodo para contar numeros	
	public int contarNumeros(String palabra) {
		int numeros = 0;
		for (char caracter : palabra.toCharArray() ) {
			if(esNumero(caracter)) {
				numeros ++;
			}
		}
		return numeros;
	}
	
	//Método para contar consonantes
		public int contarConsonantes(String palabra) {
			int consonantes = 0;
			for (char caracter : palabra.toCharArray() ) {
				if(esConsonante(caracter)) {
					consonantes++;
				}
			}
			return consonantes;
		}
		
		//Método para contar símbolos
		public int contarSimbolos(String palabra) {
			int simbolos = 0;
			for (char caracter : palabra.toCharArray() ) {
				if(esSimbolo(caracter)) {
					simbolos++;
				}
			}
			return simbolos;
		}
	
	
	
}//class
