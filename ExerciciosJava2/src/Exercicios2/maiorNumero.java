package Exercicios2;

import java.util.Scanner;

public class maiorNumero {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEntre com o primeiro n�mero.");
		double numero = ler.nextDouble();
		System.out.println("\nEntre com o segundo n�mero.");
		double numero2 = ler.nextDouble();
		System.out.println("\nEntre com o terceiro n�mero.");
		double numero3 = ler.nextDouble();
		
		if(numero>=numero2 && numero>=numero3)
		{
			System.out.println(numero);
		}
		else if(numero2>=numero && numero2>=numero3)
		{
			System.out.println(numero2);
		}
		else if(numero3>=numero && numero3>=numero2)
		{
			System.out.println(numero3);
		}
	}

}
