package controlFlujo;
import java.util.Scanner;

public class FlujoControl {

	public static void main(String[] args) { //Debe coincidir la clase con el nombre del documento.
				
		//recuerda que para que algo se ejecute, siempre debe de ir en el metodo principal 
		
		//Primero defino una variable del tipo string donde se almacena un dato 
		// String viaje = null; //Dejo en null y despues agrego fecha 
		//Variable declarada e inicializada, en null a proposito, para tener un "espacio" de memmoria ya asignado, y solo reemplazarlo por un nuevo dato 
		
		//Para validar si podemos viajar en cierta fecha
		
		
		/*
		String viaje = "16-01-2024";
				
		if (viaje != null) { //variable vacia
					System.out.println("Ya no tenemos fechas disponibles, una disculpa.");
					
		} else {
					System.out.println("Puede reservar su viaje");
		}
		*/
		
///////////////////////////////////
		/*
	//Validacion de contraseña
	Scanner scanner = new Scanner(System.in);

	// Solicitar la primera contraseña
		System.out.print("Ingrese la contraseña: ");
		String contraseña1 = scanner.nextLine();

	 // Solicitar la segunda contraseña
		System.out.print("Ingrese la contraseña nuevamente: ");
		String contraseña2 = scanner.nextLine();

	// Verificar si las contraseñas coinciden
		if (contraseña1.equals(contraseña2)) {
		   	System.out.println("Las contraseñas coinciden. Acceso permitido.");
		} else {
		   	System.out.println("Las contraseñas no coinciden. Acceso denegado.");
	 }

	// Cerrar el scanner
		scanner.close();
		
		*/
		
////////////////////////////////////////
		//switch: para seleccionar comida de la dulceria del cine
        
        //selecion de opciones, variable que almacena dicha opcion

		
		
        
        // crear un menu

        System.out.println("Bienvenido a la dulceria \n"
        + "1. Palomitas\n"
        + "2. Refresco\n"
        + "3. Nachos\n"
        + "4. HotDog\n"
        + "5. Pagar\n");
        
       
        Scanner input = new Scanner(System.in);
        
        int menu = 0;
        char continuar = 's';
        
        
        do { 
        	
       System.out.println("seleccione una opcion del 1 al 5");
        menu = Integer.parseInt(input.nextLine());
        
        switch (menu) {
        case 1:
        	System.out.println("Usted ha agregado palomitas a su combo.");
        	break;
        case 2:
        	System.out.println("Usted ha agregado refresco a su combo.");
        	break;
        case 3:
        	System.out.println("Usted ha agregado nachos a su combo.");
        	break;
        case 4:
        	System.out.println("Usted ha agregado hotdog a su combo.");
        	break;
        case 5:
        	System.out.println("Pagar combo");
        	break;
        default:
        	System.out.println("No contamos con eso en nuestro menu, por favor seleccione una opcion valida (1-5).");
        	break;
        } 
        System.out.println("Desea agregar algo mas? Si-No");
        	
        continuar = input.nextLine().charAt(0);
        
        } while (continuar == 's' || continuar == 'S');
		
		input.close();
		
	} //Main

} //Clase
