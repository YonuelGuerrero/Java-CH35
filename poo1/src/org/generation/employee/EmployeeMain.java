package org.generation.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// Instanciar los objetos
		Employee Daniel = new Employee("Daniel", "Maldonado", 7836, 8596.33d, "Instructor");
		Employee Abigail = new Employee("Abigail", "Martinez", 8276, 19754.76d, "Desarrolladora Frontend");
		Employee Arturo = new Employee("Arturo", "Avila", 8274, 17999.46d, "Desarrollador backend");
		
		System.out.println(Daniel);
		System.out.println(Abigail);
		System.out.println(Arturo);
		
		//Invocando metodos definidos previamente (trabajar, calcularSalario, etc)
		
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Abigail.capacitarse();
		
		
		//Utilizar informacion especifica de cada objeto mediante sus propiedades
			//Usando getter
		System.out.println(Daniel.getNombre() + " " + Daniel.getApellido() + " ocupa el puesto de " + Daniel.getPuesto());
			//Accediendo a la propiedad del objeto 
		System.out.println(Abigail.puesto + " gana $" + Abigail.salario);
		
		//Actualizando informacion mediante setter
		Arturo.setSalario(24598.11);
		Arturo.calcularSalario();
		
		
		
		

	}//main

}//class
