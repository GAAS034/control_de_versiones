package refactorización2;

public class PedidoOriginal {
	public static double procesarPedido(Product[] productos, double impuesto, double descuento) {
		double subtotal = 0;
		subtotal = calcularSubTotal(productos, subtotal);
		subtotal = añadirImpuesto(impuesto, subtotal);
		double total = añadirDescuento(descuento, subtotal);
		return total;
	}

	public static double calcularSubTotal(Product[] productos, double total) {
		for (int i = 0; i < productos.length; i++) {
			total += productos[i].getPrecio() * productos[i].getCantidad();
		}
		return total;
	}

	public static double añadirDescuento(double descuento, double total) {
		total = total - (total * descuento / 100);
		return total;
	}

	public static double añadirImpuesto(double impuesto, double total) {
		total = total + (total * impuesto / 100);
		return total;
	}
	
	                                

	public static void main(String[] args) {
		Product[] carrito = { new Product("Camiseta", 20, 2), new Product("Pantalón", 35, 1),
				new Product("Zapatos", 50, 1) };
		double precioFinal = procesarPedido(carrito, 10, 5);
		System.out.println("El precio final del pedido es: " + precioFinal);
		System.out.println("Hola");
		System.out.println("ADIOS");
		}
	
	
}