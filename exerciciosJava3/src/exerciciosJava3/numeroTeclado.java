package exerciciosJava3;

import java.util.Scanner;

public class numeroTeclado {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		System.out.println("Entre com um n�mero: ");
		double numero= ler.nextDouble();
		double somaNumero = 0;
		do
		{
			somaNumero += numero;
			System.out.println("Entre com um n�mero: ");
			numero= ler.nextDouble();
			
		}
		while(numero!=0);
		
		System.out.println("A soma total dos n�meros inserido � igual �: "+somaNumero);
	}	

}
