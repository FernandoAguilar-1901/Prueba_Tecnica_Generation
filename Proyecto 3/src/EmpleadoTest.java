//Se crea la clase "Empleado Test"
public class EmpleadoTest {

	//Se genera metodo main para introducir lo que buscamos que nuestro programa ejecute
	public static void main(String[] args) {
		
		
		
		//Se crean 2 empleados respetando el orden que llevan sus atributos dentro del constructor
		//Nota: se agrega un tercer empleado para verificar el funcionamiento del contador de empleados
		Empleado Carlos = new Empleado ("Carlos Eduardo", "Vazquez Juarez", 10000.00, 0);
		Empleado Diego = new Empleado ("Diego Antonio", "Perez Juarez", 15000.00, 0);
		Empleado Fernando = new Empleado ("Fernando Alberto", "Aguilar Cano", 12000.00, 0);
		
		
		
		//Se imprime en consola la informacion de los empleados
		System.out.println(Carlos);
		System.out.println("");
		System.out.println(Diego);
		System.out.println("");
		System.out.println(Fernando);
		System.out.println("");
		System.out.println("***************************");
		
		
		
		
		//Se calculan tanto el aumento de salario mensual como el total de salario anual de cada empleado con el metodo aumentoDeSalario y se mandan a imprimir en la consola
		
		/*
		 * Primer empleado
		 * 
		 * Resultados esperados
		 * 
		 * Salario: 10000.00
		 * Salario mensual con aumento: 11000.00
		 * Salario anual con aumento: 132000.00
		 * */
		System.out.println("Salario de empleado Carlos: ");
		Carlos.getAumentoDeSalario(10000.00);
		System.out.println("***************************");
		
		
		
		/*
		 * Segundo empleado
		 * 
		 * Resultados esperados
		 * 
		 * Salario mensual con aumento: 16500.00
		 * Salario anual con aumento: 198000.00
		 * */
		System.out.println("Salario de empleado Diego: ");
		Diego.getAumentoDeSalario(15000.00);
		System.out.println("***************************");
		
		
		
		/*
		 * Tercer empleado
		 * 
		 * Resultados esperados
		 * 
		 * Salario mensual con aumento: 13200.00
		 * Salario anual con aumento: 158400.00
		 * */
		System.out.println("Salario de empleado Fernando: ");
		Fernando.getAumentoDeSalario(12000.00);
		System.out.println("***************************");
		System.out.println("");
		System.out.println("**** Historial de empleados ****");
		System.out.println(Diego.getHistorialDeEmpleados());
	}

}
