//Inicio Proyecto 3

//Paso 1
//Se crea la clase "Empleado"
public class Empleado {

	
	
	
	//Paso 2
	//Se declaran las variables que seran instanciadas posteriormente
	//Las variables contadorDeEmpleados y numeroDeEmpleados serviran para registrar el numero de empleados que han pasado por la empresa
	public String nombreDeEmpleado;
	public String apellidoDeEmpleado;
	public Double salarioMensual;
	public int contadorDeEmpleados;
	public static int numeroDeEmpleado = 0;
	
	
	
	
	//Paso 3
	//Se genera el constructor de empleados
	public Empleado(String nombreDeEmpleado, String apellidoDeEmpleado, Double salarioMensual,
			int contadorDeEmpleados) {
		super();
		contadorDeEmpleados = numeroDeEmpleado++;
		this.nombreDeEmpleado = nombreDeEmpleado;
		this.apellidoDeEmpleado = apellidoDeEmpleado;
		this.salarioMensual = salarioMensual;
		this.contadorDeEmpleados = contadorDeEmpleados;
	}

	
	
	
	//Paso 4
	//Se crean los metodos Get y Set correspondientes a las variables a instanciar
	
//////////////////////////// Metodos Get y Set para nombreDeEmpleado
	public String getNombreDeEmpleado() {
		return nombreDeEmpleado;
	}


	public void setNombreDeEmpleado(String nombreDeEmpleado) {
		this.nombreDeEmpleado = nombreDeEmpleado;
	}

	
	
/////////////////////////// Metodos Get y Set para apellidoDeEmpleado
	public String getApellidoDeEmpleado() {
		return apellidoDeEmpleado;
	}


	public void setApellidoDeEmpleado(String apellidoDeEmpleado) {
		this.apellidoDeEmpleado = apellidoDeEmpleado;
	}

	
	
////////////////////////////// Metodos Get y Set para salarioMensual
	public Double getSalarioMensual() {
		return salarioMensual;
	}


	public void setSalarioMensual(Double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	
	
//////////////////////////////// Metodos Get y Set para contadorDeEmpleados
	public int getContadorDeEmpleados() {
		return contadorDeEmpleados;
	}


	public void setContadorDeEmpleados(int contadorDeEmpleados) {
		this.contadorDeEmpleados = contadorDeEmpleados;
	}

	
	
///////////////////////////////// Metodos Get y Set para numeroDeEmpleado
	public static int getNumeroDeEmpleado() {
		return numeroDeEmpleado;
	}


	public static void setNumeroDeEmpleado(int numeroDeEmpleado) {
		Empleado.numeroDeEmpleado = numeroDeEmpleado;
	}

	
	
////////////////////////////////// 
	
	
	
	//Paso 5
	//Se crea metodo aumentoDeSalario para calcular aumento de salario del 10% y calcular el salario anual del empleado
	public void getAumentoDeSalario(Double salarioMensual) {
		System.out.println("Salario mensual con aumento del 10%: " + (this.salarioMensual+this.salarioMensual/10));
		System.out.println("Salario anual con aumento: " + (this.salarioMensual/10+this.salarioMensual)*12);
	}
	
//////////////////////////////////
	
	
	
	//Paso 6
	//Se crea variable historialDeEmpleados con el cual se realizara el conteo de empleados que han pasado por la empresa
	String getHistorialDeEmpleados() {
		return "Cantidad de empleados que ha tenido la empresa: " + Empleado.numeroDeEmpleado;
	}
	
//////////////////////////////////
	
	
	
	
	//Paso 7
	//Se crea metodo toString para obtener la informacion de los empleados en consola
	@Override
	public String toString() {
		return "Empleado [nombreDeEmpleado=" + nombreDeEmpleado + ", apellidoDeEmpleado=" + apellidoDeEmpleado
				+ ", salarioMensual=" + salarioMensual + "]";
	}
	
	
}//Termina clase Empleado
