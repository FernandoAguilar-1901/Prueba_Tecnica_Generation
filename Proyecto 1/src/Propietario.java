//Inicio proyecto 1


//Paso 1
//Se crea la clase "Propietario"
public class Propietario {
	
	
	
	//Paso 2
	//Se declaran las variables que seran instanciadas posteriormente
	public String nombrePropietario;
	public Long CPF;
	public String RG;
	public String fechaDeNacimiento;
	public String nombreDeCalle;
	public String nombreDeVecindario;
	public String nombreDeCiudad;
	public String expresarPropietario;
	public int codigoPostal;
	public String complementarPropietario;
	
	
	
	
	
	//Paso 3
	//Se crea el constructor con las variables indicadas para Propietario
	public Propietario(String nombrePropietario, Long cPF, String rG) {
		super();
		this.nombrePropietario = nombrePropietario;
		CPF = cPF;
		RG = rG;
	}

}
