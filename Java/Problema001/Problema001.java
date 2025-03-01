import java.util.Scanner;

public class Problema001{
	public static void main(String args[]){
		//Variables
		int num1, num2, suma;

		//Entrada
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		num1 = teclado.nextInt();
		System.out.println("Numero 2: ");
		num2 = teclado.nextInt();

		//Proceso
		suma = num1 + num2;

		//Salida
		System.out.println("");
		System.out.println("Suma: " + suma);
	}
}