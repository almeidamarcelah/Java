package exerciciosJava3;

import java.util.Scanner;

public class prefeitura {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double x,perc;
		for(x=1;x<=20;x++)
		{
			System.out.println("\nEntre com sálario: ");
			double salario=ler.nextDouble();
			System.out.println("\nEntre com o numero de filhos: ");
			double filhos=ler.nextDouble();
			
			double somaS=0,somaF=0,maiorS=0,cont100=0,mediaS=0,mediaF=0;
			
			somaS+=salario;
			somaF+=filhos;
			
			if(maiorS<salario)
			{
				maiorS=salario;
			}
			if(salario<=100)
			{
				cont100++;
			}
			mediaS=somaS/x;
			mediaF=somaF/x;
			perc=(cont100*100)/(x-1);
			System.out.println("\nMédia salárial: "+mediaS);
			System.out.println("\nMédia de filhos: "+mediaF);
			System.out.println("\nMaior salario: "+maiorS);
			System.out.println("\nPercentual de pessoas que recebem até 100 reais: "+perc);
			
		}
	}

}
