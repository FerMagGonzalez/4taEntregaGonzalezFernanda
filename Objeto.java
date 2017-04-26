
package ProbMochilaSinFrac;

/**
 * @author Fernanda M. Gonzalez
 */

//Clase que almacena los datos del objeto 

public class Objeto implements Comparable<Objeto>{ 

	String nombre;
	int peso; 
	int valor; 
	int cantidad;
	double proporcion; 

	public Objeto(){ 
		nombre = " ";
		peso = 0; 
		valor = 0; 
		cantidad = 0;
		proporcion = -1; 
	} 

	public Objeto(String nomb, int peso, int valor, int cant){ 
		this.nombre = nomb;
		this.peso = peso; 
		this.valor = valor; 
		this.cantidad = cant;
		if(peso > 0){ 
			proporcion = this.valor / this.peso; 
		}
		else{ 
			proporcion = -1; 
		} 
	} 

	@Override 
	public int compareTo(Objeto o) { 
		int res = 0; 
		if((this.proporcion > o.proporcion) || ((this.proporcion == o.proporcion) && (this.peso < o.peso))){ 
			res = -1; 
		}
		else {
			if((this.proporcion < o.proporcion) || ((this.proporcion == o.proporcion) && (this.valor > o.valor)) || 
            ((this.proporcion == o.proporcion) && (this.valor == o.valor) && (this.peso < o.peso))){ 
				res = 1; 
			} 
		}
		return res; 
	} 

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the proporcion
	 */
	public double getProporcion() {
		return proporcion;
	}

	/**
	 * @param proporcion the proporcion to set
	 */
	public void setProporcion(double proporcion) {
		this.proporcion = proporcion;
	}

	public String toString(){ 
		return "(" + nombre + ", " + peso + "Kg, $" + valor + ", " + cantidad + ", " + proporcion + ")"; 
	} 

} 