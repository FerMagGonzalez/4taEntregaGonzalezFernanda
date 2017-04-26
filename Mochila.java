
package ProbMochilaSinFrac;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Fernanda M. Gonzalez
 */
public class Mochila {

	private List<Objeto> listaObjetos; 
	private int pesoM�ximo; 

	public Mochila(){ 
		listaObjetos = new LinkedList<Objeto>(); 
		pesoM�ximo = 0; 
	} 

	public Mochila(List<Objeto> listaObjetos, int pesoM�ximo){ 
		this.listaObjetos = new LinkedList<Objeto>(listaObjetos);  
		this.pesoM�ximo = pesoM�ximo; 
	} 

	public List<Objeto> resolver(){ 
		List<Objeto> res  = new LinkedList<Objeto>(); 

		Collections.sort(listaObjetos); 
		
		int totalPeso = 0; 

		while(!listaObjetos.isEmpty() && totalPeso < pesoM�ximo){ 
			Objeto o = listaObjetos.get(0); 
			int c = o.getCantidad();
			while (c!=0 && (totalPeso + o.peso <= pesoM�ximo)){
				res.add(o); 
				totalPeso += o.peso; 
				c--;
			}
            listaObjetos.remove(o);
		}
		return res; 
	} 

	public String toString(){ 
		String res = "Peso m�ximo: " + pesoM�ximo + "Kg \nLista de objetos: "; 
		res += listaObjetos.toString(); 
		return res; 
	} 
	
}
