
package ProbMochilaSinFrac;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Fernanda M. Gonzalez
 */
public class MainProblemaMochila {

	public static void main(String[] args) {
		
		int peso = 8; 
		List<Objeto> listaObjetos= new LinkedList<Objeto>(); 
		
		                  //nombre, peso(grs), valor($), cantidad
		listaObjetos.add(new Objeto("Harina",1,50,4));
		listaObjetos.add(new Objeto("Plata",1,12000,5));
		listaObjetos.add(new Objeto("Chocolate",2,600,2));

		Mochila mochila = new Mochila(listaObjetos, peso); 
		System.out.println(mochila.toString()); 

		List<Objeto> solucion = mochila.resolver(); 
		System.out.println("Solución: " + solucion.toString()); 

	}

}
