package exerciciosJava3;

import java.util.Scanner;

public class leituraNumerica {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero por favor: ");
		int numero = ler.nextInt();
		int contPar = 0,contImpar = 0;
		
		for(numero=0;numero>=10;numero++)
		{
			if(numero%2==0)
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
			System.out.println("\nEntre com um n�mero por favor: ");
			numero = ler.nextInt();
		}
		System.out.println("Foi inserido "+contPar+" n�meros par(es) e "+contImpar+" n�meros �mpar(es)");
	}

}
