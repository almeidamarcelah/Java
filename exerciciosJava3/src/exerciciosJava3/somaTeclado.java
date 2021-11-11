package exerciciosJava3;

import java.util.Scanner;

public class somaTeclado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nPor favor, digite um número: ");
		int numero = ler.nextInt();
		int contN=0,soma=0;
		do
		{
			soma+=numero;
			contN++;
		}
		while(numero>contN);
		System.out.println("\nA soma de 1 até "+numero+" é "+soma);
	}

}
