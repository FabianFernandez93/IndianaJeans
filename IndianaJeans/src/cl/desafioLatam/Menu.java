package cl.desafioLatam;
import java.util.*;
import utility.*;

import desafiolatam.dao.*;
	
public class Menu {
	
	
	Scanner sc = new Scanner(System.in);
	String opcion = null;
	Utilidad utilidad = new Utilidad();
	ExportarTxt exportarTxt = new ExportarTxt();
	

	public void ImprimirMenu(ProductoServicio productoServicio, Exportador exportadorTxt) {
	
		while(true) {
		
		System.out.println("\t———-——M E N U—--—-—");
		System.out.println();
		System.out.println("\t[l] Listar Producto");
		System.out.println("\t[2] Agregar Producto");
		System.out.println("\t[3] Exportar Datos");
		System.out.println("\t[4] Salir");
		System.out.println();
		System.out.print("\tIngrese una opcion:  \n");
	
		
			
			opcion = sc.next();
			
			switch (opcion) {
			
			case "1":
				utilidad.tiempoEspera("Buscando Productos", 100);
				productoServicio.listarProductos();
				break;
			case "2": 
				utilidad.tiempoEspera("Agregando Productos", 100);
				productoServicio.agregarProducto(sc);	
				break;
			case "3":
				
				utilidad.tiempoEspera("Exportando Productos", 100);
				productoServicio.exportarLista();
				// exportadorTxt.exportar();
				break;
			case "4":
				utilidad.tiempoEspera("Saliendo del Programa", 100);
				System.exit(0);
				break;
			default:
				utilidad.tiempoEspera("Ingrese una opción correcta", 100);
				break;
				
				
				
				
				
				
				
				
			}
		}
	
	
	
	
	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		try (Scanner sc = new Scanner(System.in)) {
			try{
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
		System.out.println("Error");
		sc.nextLine();
			}

		}
		ProductoServicio ps = new ProductoServicio();
		switch (opcion) {
		case 1:
			ps.listarProductos();
			break;
		case 2:
			ps.agregarProductos(null, null, null, null, null, null, null);
			break;
		case 3:
			ExportadorTxt txt = new ExportadorTxt();
			txt.limpiaPantalla();
			break;
		case 4:
			System.out.println("Fin del programa");
			System.exit(0);
			break;
//			default:
//			System-out.Println<"9§;e reeneeste"):
//			break;
		}
}

	public void menuAgregarProducto() {
		System.out.println("Menu Agregar Producto");
	}
	
}                */


