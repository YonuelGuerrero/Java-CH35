package tiposDeDatosYVariables;

public class ejercicioDatos {

	public static void main(String[] args) {

		
		System.out.println("Hola guorl");
		
		/*Comentarios 
		 * multilinea*/
		//Comentarios una sola linea
		
		byte edad = 15; //Sirve para representar un numero entero 8 bits (-128 al 127) 
		
		System.out.println("Edad del participante"+edad);	
		
		short usuariosNuevos = 200;//Sirve para representar un numero entero 16 bits (-23768 al 32767)
		
		System.out.println("Usuarixs nuevos" +usuariosNuevos);
		
		int usuariosTotales = 8752;// sirve para representar un numero entero 32 bits (-2147483648 al 2147483647)
		
		System.out.println("Usuarios Totales "+ usuariosTotales);
		 
		long usuariosPremium = 9512; //sirve para presentar un entero con valores mucho mayores
		
		System.out.println("usuarios premium " + usuariosPremium);
		
		//Tipos de datos con numeros decimales 
		
		float altura = 1.61f; //num con hasta 6 decimales
		
		System.out.print("altura de usuario: " + altura);
		
		double peso = 68.800; //nums con hasta 15 decimales
		
		//cadena de texto
		String nombreDeUsuario = "Yonuel";
		String costoBoleto = "500";
		String zonaBoleto = "52";
		
		System.out.println("Nombre de usuario: " + nombreDeUsuario);
		System.out.println("zona del boleto: " + zonaBoleto);
		//Tipo char
		char seccion = 'f'; //sirve para representar valores con un solo caracter
		
		System.out.println("seccion" + seccion);
		
		boolean clienteFrecuente = true; //True o false utilizando condicionales
		
		System.out.println("Es un cliente frecuente " + clienteFrecuente);
		
		//Conversion de tipos
		
		//casteo a entero 
		int pesoDiferente = (int) peso;
		
		//casteo entero 
		long pesoCambio1 = (long) peso;
		
		System.out.println("double " + peso);
		System.out.println("int " + pesoDiferente);
		System.out.println("long " + pesoCambio1);
				
		int nombreCambio = Integer.parseInt(costoBoleto);
		double zonaCambio = Double.parseDouble(zonaBoleto);
		
		System.out.println("Zona del usuario segun su boleto: "+(nombreCambio * zonaCambio));
		
		/*Operadores aritmeticos 
		+ suma
		- resta
		* multiplicacion
		/ division
		 % Residuo*/
		
		
		/*Operadores de compararcion 
		 == compara si un opernado es igual a otro 
		 != compara si es diferente 
		 >  mayor que 
		 <  menor que 
		 >= mayor o igual que 
		 <= menor o igual que */
		
		double precioEntrada = 75.5;
		double precioPalomitas = 89.7;
		double precioBebida = 35.5;
		int capacidadTotal = 500;
		
		int personasDentro = 342;
		
		if (personasDentro > capacidadTotal) {
			System.out.println("Lo 100to preciose ya no cabes");
		
		} else {
			System.out.println("pasele a lo barrido padrino");
		};
		
		double totalEntrada = personasDentro * precioEntrada;
		double totalPalomitas = personasDentro * precioPalomitas;
		double totalBebida = personasDentro * precioBebida;
		
		System.out.println("Total de personas: " + personasDentro);
		System.out.println("Total de entradas: " + totalEntrada);
		System.out.println("Total de palomitas: " + totalPalomitas);
		System.out.println("Total de bebbidas: " + totalBebida);
		
		
	
	}

}
