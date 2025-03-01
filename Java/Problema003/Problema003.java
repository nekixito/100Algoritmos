import java.util.Scanner;

public class Problema003{
	//Dado el valor de venta de un producto, hallar el Impuesto General a las Ventas (IGV,19%) y el precio de venta.
	public static void main(String args[]){
		//Variables
		double valorVenta, igv, precioVenta;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("Valor de venta: ");
		valorVenta = teclado.nextDouble();

		//Proceso
		igv = valorVenta * 0.19;
		precioVenta = valorVenta + igv;

		//Salida
		System.out.println("");
		System.out.println("IGV: " + igv);
		System.out.println("Precio de venta: " + precioVenta);

	}
}