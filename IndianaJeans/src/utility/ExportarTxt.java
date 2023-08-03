package utility;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import cl.desafioLatam.Producto;
import utility.ExportarTxt;
import desafiolatam.dao.ProductoServicio;

public class ExportarTxt extends Exportador {
  

	@Override
	public void exportar() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("productos.txt"))) {
            Producto[] listaProductos = null;
			for (Producto producto : listaProductos) {
                String linea = producto.getArticulo() + "," +
                               producto.getPrecio() + "," +
                               producto.getDescripcion() + "," +
                               producto.getCodigo() + "," +
                               producto.getTalla() + "," +
                               producto.getMarca() + "," +
                               producto.getColor();
                writer.println(linea);
            }
            System.out.println("La lista de productos se ha exportado correctamente a 'productos.txt'.");
        } catch (IOException e) {
            System.out.println("Error al exportar la lista de productos: " + e.getMessage());
        }
    }
	
}