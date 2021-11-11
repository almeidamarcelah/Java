package exerciciosJava3;

import java.util.Scanner;

public class multiplicacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		int numero=ler.nextInt();
		
		while(numero<100)
		{
			numero = numero*3;
			System.out.println(numero+"\n");
		}
	}

}
