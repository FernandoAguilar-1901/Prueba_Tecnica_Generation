//Inicio del proyecto2


//Paso 1
//Se crea la clase "Factura"
public class Factura {

	
	
	
	//Paso 2
	//Dentro de la clase factura, declaramos sus propiedades
	public String numeroDeFactura;
	public String descripcionDeFactura;
	public int cantidadDeArticulos;
	public Double precioDeArticulo;
		
	
	
	
	//Paso 3
	//Se genera el constructor de Facturas para la clase Factura
	public Factura(String numeroDeFactura, String descripcionDeFactura, int cantidadDeArticulos,
			Double precioDeArticulo) {
		super();
		this.numeroDeFactura = numeroDeFactura;
		this.descripcionDeFactura = descripcionDeFactura;
		this.cantidadDeArticulos = cantidadDeArticulos;
		this.precioDeArticulo = precioDeArticulo;
	} //Termina constructor
	
	
	
	
	
	//Paso 4
	//Se crean los metodos Get y Set para cada variable que vamos a instanciar
	///////////////////////////// Get y Set para numeroDeFactura
	
	public String getNumeroDeFactura() {
		return numeroDeFactura;
	}

	public void setNumeroDeFactura(String numeroDeFactura) {
		this.numeroDeFactura = numeroDeFactura;
	}
	
	///////////////////////////// Get y Set para descripcionDeFactura

	public String getDescripcionDeFactura() {
		return descripcionDeFactura;
	}

	public void setDescripcionDeFactura(String descripcionDeFactura) {
		this.descripcionDeFactura = descripcionDeFactura;
	}
	
	/////////////////////////////// Get y Set para cantidadDeArticulos

	public int getCantidadDeArticulos() {
		return cantidadDeArticulos;
	}
	

	public void setCantidadDeArticulos(int cantidadDeArticulos) {
		this.cantidadDeArticulos = cantidadDeArticulos;
	}
	
	///////////////////////////////// Get y Set para precioDeArticulo

	public Double getPrecioDeArticulo() {
		return precioDeArticulo;
	}

	public void setPrecioDeArticulo(Double precioDeArticulo) {
		this.precioDeArticulo = precioDeArticulo;
	}
	
	
	
	
	//Paso 5
	//Creacion de metodo getTotalFactura para calcular el monto final de esta
	
	public void getTotalFactura(int cantidadDeArticulos, Double precioDeArticulo) {
		int totalFactura = (int) ((cantidadDeArticulos)*(precioDeArticulo)); // Se declara la variable totalFactura con la cual le indicamos al programa
		//Que debera ejecutar esta accion para calcular el monto final de la factura
		
		//Se establece un condicionante que le permitira al programa diferenciar entre positivos y negativos para las variables totalFactura y precioDeArticulo
		if ((totalFactura < 0)) {
			totalFactura = 0;
			precioDeArticulo = 0.0;
			System.out.println("Precio del articulo: " +precioDeArticulo);
			System.out.println("Total de la factura: " + totalFactura);
		} 		else {
			System.out.println("Precio del articulo: " +precioDeArticulo);
			System.out.println("Total de la factura: " + totalFactura);
			} //termina condicionante if else
	}//termina metodo getTotalFactura

	
	//////////////////////////////////
	
	
	
	//Paso 6
	//Se genera metodo toString para poder cargar nuevos datos e imprimirlos en consola, en este caso se busca poder observar los datos de cada factura
	@Override
	public String toString() {
		return "Factura: [numeroDeFactura=" + numeroDeFactura + ", descripcionDeFactura=" + descripcionDeFactura
				+ ", cantidadDeArticulos=" + cantidadDeArticulos + ", precioDeArticulo=" + precioDeArticulo + "]";
	}
	
	
	
	
} // termina clase factura

