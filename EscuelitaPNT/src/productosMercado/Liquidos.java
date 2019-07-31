package productosMercado;

public class Liquidos extends Productos {

	public Liquidos() {
		super();
	}
	
	public Liquidos(String nombre, String contenido, int precio) {
		super(nombre,contenido,precio);		
	}
	
	public String toString() {
		return "Nombre: "+nombre+" // "+contenido+" // "+"Precio: $"+precio;
	}
}
