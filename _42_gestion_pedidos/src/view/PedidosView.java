package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Pedido;
import service.PedidosService;

public class PedidosView {
	
	static PedidosService pedidosService = new PedidosService();
	static SimpleDateFormat formatofecha=new SimpleDateFormat("dia-mes-año");
	

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				añadirPedido();
				break;
			case 2:
				masReciente();
				break;   
			case 3:
				mostrarTodos();
				break;
			
			case 4: System.out.println("--- Adios ---");
			}
		}while(opcion!=4);

	}
	
	static void mostrarMenu() {
		System.out.println("1.- Nuevo pedido");
		System.out.println("2.- Saber cual es el pedido más reciente");
		System.out.println("3.- Mostrar todos los pedidos");
		System.out.println("4.- Salir"); 
	}	
	
	static void  añadirPedido() throws ParseException {
		
		String producto;
		Date fecha;
		Double precio;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Producto: ");
		producto=sc.nextLine();
		System.out.println("Cuándo fue comprado (dd-mm-aaaa): ");
	//	SimpleDateFormat formatofecha=new SimpleDateFormat("dia-mes-año");
		fecha = formatofecha.parse(sc.nextLine());
		System.out.println("Precio:");
		precio=Double.parseDouble(sc.nextLine());
		pedidosService.nuevoPedido(producto, fecha, precio);
		
	}
	
	static void masReciente() {
		Pedido pedido=pedidosService.pedidoReciente();
	//	SimpleDateFormat formatofecha=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("El pedido más reciente es: ");
		System.out.println(pedido.getProducto()+" con precio  "+pedido.getTotal()+" € comprado el "+ formatofecha.format(pedido.getFecha()));
	}

	static void mostrarTodos() {
	//	SimpleDateFormat formatofecha=new SimpleDateFormat("dd-MM-yyyy");
		Pedido[] pedidos = pedidosService.mostrarPedidos();
		for (Pedido p: pedidos) {
			System.out.println(p.getProducto()+"-->"+p.getTotal()+" € el dia "+formatofecha.format(p.getFecha()));
		}
		
	}
}
