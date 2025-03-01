import java.util.Scanner;

public class Problema004{
	//Hallar la potencia de a^n, donde a y n son enteros positivos.
	public static void main(String args[]){
		//Variables
		int a, n, potencia;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("a: ");
		a = teclado.nextInt();

		System.out.print("n: ");
		n = teclado.nextInt();

		//Proceso
		potencia = (int)Math.pow(a,n);

		//Salida
		System.out.println("");
		System.out.println("Potencia: " + potencia);
		
	}
}