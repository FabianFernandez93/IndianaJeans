package controller;


import utility.*;
import cl.desafioLatam.*;

import desafiolatam.dao.ProductoServicio;

public class AppJeans {
	

public static void main(String[] args) {
	
	Menu menu = new Menu();
	ProductoServicio productoServicio = new ProductoServicio();
	ExportarTxt exportadorTxt = new ExportarTxt();
	menu.ImprimirMenu(productoServicio, exportadorTxt);
	
	
	}

}

/*
daoProducto.listarProductos();
List<Producto> nuevaLista = daoProducto.MostrarTodo();
daoProducto.exportarLista(nuevaLista);
*/
