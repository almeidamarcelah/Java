package exerciciosJava3;

import java.util.Scanner;

public class valoresPositivos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numero=0,soma=0,media=0,quantidade=0;
		while(numero>=0)
		{
			System.out.println("\nDigite um n�mero");
			numero = ler.nextDouble();
			soma+=numero;
			quantidade++;
		}
		media= soma/quantidade;
		System.out.println("\nA soma dos n�mero �: "+soma);
		System.out.println("\nA media dos n�mero �: "+media);
		System.out.println("\nA quantidade de valores fornecidos foi: "+quantidade);
	}

}
