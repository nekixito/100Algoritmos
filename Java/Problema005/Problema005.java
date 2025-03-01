import java.util.Scanner;

public class Problema005{
	//Hallar la radicación de a^(1/n), donde a y n son enteros positivos.
	public static void main(String args[]){
		//Variables
		int a, n, radicacion;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("a: ");
		a = teclado.nextInt();

		System.out.print("n: ");
		n = teclado.nextInt();

		//Proceso
		radicacion = (int)Math.pow(a , (double)1/n);

		//Salida
		System.out.println("");
		System.out.println("Radicacion: " + radicacion);
		
	}
}