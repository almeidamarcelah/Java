package exerciciosJava3;

import java.util.Scanner;

public class multiplos3 {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		System.out.println("Entre com um n�mero: ");
		double numero= ler.nextDouble();
		double media = 0, somaNumero=0;
		int cont = 0;
		do
		{
			if(numero%3==0)
			{
				cont++;
				somaNumero+=numero;
				media=somaNumero/cont;
			}
			System.out.println("Entre com um n�mero: ");
			numero= ler.nextDouble();
		}
		while(numero!=0);
		System.out.println("A media dos multiplos de 3 �: "+media);
		System.out.println("A soma total dos n�meros inserido � igual �: "+somaNumero);
	}	

}
