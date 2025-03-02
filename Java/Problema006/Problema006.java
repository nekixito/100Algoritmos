import java.util.Scanner;

public class Problema006{
	//Dado un numero n, hallar e imprimir el numero en orden inverso
	public static void main(String args[]){
		//Variables
		int num, numInverso, residuo;

		//Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero: ");
		num = teclado.nextInt();


		//Proceso
		//Ejemplo 12345
		residuo = num % 10; //5
		num = num / 10; //1234
		numInverso = residuo * 10; //50

		residuo = num % 10; //4
		num = num / 10; //123
		numInverso = (numInverso + residuo) * 10; //540
		
		residuo = num % 10; //3
		num = num / 10; //12
		numInverso = (numInverso + residuo) * 10; //5430

		residuo = num % 10; //2
		num = num / 10; //1
		numInverso = (numInverso + residuo) * 10; //54320

		numInverso = numInverso + num;

		//Salida
		System.out.println("");
		System.out.println("Inverso: " + numInverso);
		


	}
}