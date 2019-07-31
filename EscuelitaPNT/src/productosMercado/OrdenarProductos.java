package productosMercado;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarProductos {

	ArrayList<Productos> productos = new ArrayList<>();
	
	public OrdenarProductos(ArrayList<Productos> productos) {
		this.productos = productos;
	}
	
	 public ArrayList<Productos> getProductosPorPrecio() {         
		    Collections.sort(productos);         
		    return productos;     
		  } 
}
