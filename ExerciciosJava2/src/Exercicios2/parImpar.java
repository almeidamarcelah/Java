package Exercicios2;

import java.util.Scanner;

public class parImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite um n�mero: ");
		double numero = ler.nextDouble();
		
		if (numero%2 == 0)
		{
			System.out.println("Esse n�mero � par.");
			numero = Math.sqrt(numero);
			System.out.println("\nA raiz quadrada do n�mero par �: "+numero);
		}
		else 
		{
			System.out.println("\nEsse n�mero � �mpar.");
			numero = Math.pow(numero,2);
			System.out.println("\nO quadrado do numero �mpar �: "+numero);
		}
	}

}
