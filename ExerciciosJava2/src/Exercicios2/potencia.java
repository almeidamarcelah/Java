package Exercicios2;

import java.util.Scanner;

public class potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nPor favor, digite o primeiro n�mero: ");
		double n1 = ler.nextDouble();
		System.out.println("\nPor favor, digite o segundo n�mero: ");
		double n2 = ler.nextDouble();
		System.out.println("\nPor favor, digite o terceiro n�mero: ");
		double n3 = ler.nextDouble();
		System.out.println("\nPor favor, digite o quarto n�mero: ");
		double n4 = ler.nextDouble();
		
		System.out.println("\nAgora iremos calcular o quadrado dos n�meros inseridos.");
		
		double r1 = Math.pow(n1,2);
		double r2 = Math.pow(n2,2);
		double r3 = Math.pow(n3,2);
		double r4 = Math.pow(n4,2);
		
		if(r3>1000)
		{
			System.out.println("\nO valor do quadrado do terceiro n�mero �: "+r3);
		}
		else
		{
			System.out.println("\nOquadrado de "+n1+" �: "+r1);
			System.out.println("\nOquadrado de "+n2+" �: "+r2);
			System.out.println("\nOquadrado de "+n3+" �: "+r3);
			System.out.println("\nOquadrado de "+n4+" �: "+r4);
		}
	}

}
