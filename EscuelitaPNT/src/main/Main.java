package main;

import java.util.ArrayList;
import productosMercado.Productos;
import productosMercado.Frutas;
import productosMercado.Liquidos;
import productosMercado.OrdenarProductos;

public class Main{
	
	public static ArrayList<Productos> items = new ArrayList<Productos>();
	
	public static void main(String[] args) {
		
		Productos cocaZero = new Liquidos("Coca-Cola Zero","Litros: 1.5",20);
		Productos coca = new Liquidos("Coca-Cola","Litros: 1.5",18);
		Productos sedal = new Liquidos("Shampoo Sedal","Contenido: 500ml",19);
		Productos frutilla = new Frutas("Frutilla",64,"kilo");
	
		items.add(cocaZero);
		items.add(coca);
		items.add(sedal);
		items.add(frutilla);
		
		for (Productos item : items) {
			System.out.println(item.toString());
		}
	
		OrdenarProductos ordenarProductos = new OrdenarProductos(items);
		ArrayList <Productos> productosOrdenados = ordenarProductos.getProductosPorPrecio();
		
		System.out.println("Producto más caro: "+productosOrdenados.get(productosOrdenados.size()-1).getNombre()+"\n"
				+ "Producto más barato: "+productosOrdenados.get(0).getNombre());
		
	}
}
