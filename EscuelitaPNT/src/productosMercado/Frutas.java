package productosMercado;

public class Frutas extends Productos{
		
	public Frutas() {
		super();
	}
		
	public Frutas(String nombre, int precio, String contenido) {
		super(nombre,contenido,precio);
	}
	
	public String toString() {
		return "Nombre: "+nombre+" // "+"Precio: $"+precio+" // Unidad de venta: "+contenido;
	}
}
