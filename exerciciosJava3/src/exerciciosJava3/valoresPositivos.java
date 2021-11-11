package exerciciosJava3;

import java.util.Scanner;

public class valoresPositivos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numero=0,soma=0,media=0,quantidade=0;
		while(numero>=0)
		{
			System.out.println("\nDigite um número");
			numero = ler.nextDouble();
			soma+=numero;
			quantidade++;
		}
		media= soma/quantidade;
		System.out.println("\nA soma dos número é: "+soma);
		System.out.println("\nA media dos número é: "+media);
		System.out.println("\nA quantidade de valores fornecidos foi: "+quantidade);
	}

}
