package operadoresLogicos;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		
		/*&& operador And  devuelve true si ambas expresiones son verdaderas 
		 || operador or devuelve true si almenos una de las dos condiciones se cumple
		 ! operador not si la expresion booleana es flase devuelve true y viceversa */
		
		//&& and
		
		int anios = 5;
		
		boolean esInfante = true; 
		
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es peque " + costoInfante);
		
		String cliente = "cliente123";
		String credenciales = "takisfuego123";
		
		boolean credencialCorrecta = cliente.equals("cliente123") && credenciales.equals("takisfuego123");
		
		System.out.println("Las credenciales son validas " + credencialCorrecta);
		
		
		// || or
		
		/* double costoPasaje = 380.50;
		int edad = 58;
		boolean credenInapam = false;
		
		boolean descuentoAdultoMayor = edad >=60 || credenInapam;
		
		System.out.println("Tiene descuento? " + costoPasaje);
		
		//! not 
		
		boolean asientosDisponibles = true;
		boolean libres = true;
		boolean asientosConDescuento = !libres;
		
		System.out.println("Tenemos asientos con descuento " + asientosConDescuento);
		*/
		
		
		//AUTOBUS
		String destino = "Oaxaca";
		double costoPasaje = 350;	
		int asientosTotal = 62;
		int asientosInapam = 4;
		int asientosEstudiante = 6;
		
		// Datos de pasajero 
		int edad = 35;
		boolean credenInapam=false;
		boolean credencialEstudiante=true;
		
		
		//Evaluar deescuentos
		boolean descuentoInapam = edad >= 60 && credenInapam ;
		boolean descuentoEstudiante = edad < 60 && credencialEstudiante;
		
		
		System.out.println("El destino es "+destino);
		System.out.println("El costo del pasaje entero es " + costoPasaje);
		System.out.println("La capacidad total de pasajeros es de " + asientosTotal + " pesonas");
		
		//DecimalFormat  = new DecimalFormat("#.##");
		
		//Aplicar a deescuentos
		if (descuentoInapam && (asientosInapam >=1)) {
			System.out.println("El descuento de INAPAM es del 35%");
			System.out.println("El total a pagar es "+(costoPasaje*0.65));
			System.out.println("Asientos INAPAM disponibles: "+(asientosInapam-1));
			
		}
		if (descuentoEstudiante && (asientosEstudiante >=1)) {
			System.out.println("El descuento de estudiante es del 30%");
			System.out.println("El total a pagar es "+(costoPasaje*0.7));
			System.out.println("Asientos para estudiantes disponibles: "+(asientosEstudiante-1));
		}
		
	}

}
