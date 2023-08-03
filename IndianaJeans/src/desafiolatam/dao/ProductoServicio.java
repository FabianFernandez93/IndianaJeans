package desafiolatam.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import cl.desafioLatam.Producto;
import utility.ExportarTxt;

public class ProductoServicio implements IjeansDAO{
	

	static IjeansDAO daoProducto = new ProductoServicio();	
	private List<Producto> listaProductos = new ArrayList<Producto>();
	
		
	public List<Producto>getListaProductos(){
		return listaProductos;	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void listarProductos() {
		for (Producto producto : listaProductos) {
			System.out.println(producto.toString());
			}
		if (listaProductos.size() == 0) {
			System.out.println("No hay Productos");
			}
		}
	/*
	public void exportarLista() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("productos.txt"))) {
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
    }*/
	public void exportarLista() {
		
    }
	
	public void agregarProducto(Scanner sc) {
		
	
		System.out.println("- - - - - Crear producto  - - - - - -");
		
		Producto producto = new Producto();
		System.out.println("Ingresar Articulo");
		producto.setArticulo(sc.next());		
		System.out.println("Ingresar Precio");
		producto.setPrecio(sc.next());
		System.out.println("Ingresar Descripcion");
		producto.setDescripcion(sc.next());
		System.out.println("Ingresar codigo");
		producto.setCodigo(sc.next());
		System.out.println("Ingresar Talla");
		producto.setTalla(sc.next());	
		System.out.println("Ingresar Marca");
		producto.setMarca(sc.next());
		System.out.println("Ingresar Color");
		producto.setColor(sc.next());
		
		
		//		daoProducto.agregarProductos(null, null, null, null, null, null, null);
		
		
		if(listaProductos != null) {
			listaProductos.add(producto);
			
		}else {
			System.out.println("Objeto vacio/datos incompletos");
		}
		// sc.close();
	}

	public static IjeansDAO getDaoProducto() {
		return daoProducto;
	}

	public static void setDaoProducto(IjeansDAO daoProducto) {
		ProductoServicio.daoProducto = daoProducto;
	}


	@Override
	public void exportarLista(List<Producto> Lista) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> MostrarTodo() {
		// TODO Auto-generated method stub
		return listaProductos;
	}

	@Override
	public void agregarProducto(String articulo, String precio, String descripcion, String codigo, String talla,
			String marca, String color) {
		// TODO Auto-generated method stub
		
	}

}
