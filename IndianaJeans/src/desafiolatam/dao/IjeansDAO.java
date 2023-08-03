package desafiolatam.dao;
import java.util.*;

import cl.desafioLatam.Producto;


public interface IjeansDAO {
	
	public void agregarProducto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color);
	//String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color
	
	public void listarProductos();
	
	public void exportarLista(List <Producto>Lista);

	public List<Producto> MostrarTodo();
	
}
