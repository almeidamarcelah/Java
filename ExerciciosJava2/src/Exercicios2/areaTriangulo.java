package Exercicios2;

import java.util.Scanner;

public class areaTriangulo {
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	System.out.println("\nQue tal fazermos uma atividade?");
	System.out.println("\n\t\tVamos calcular a �rea de um triangulo! \nDigite o valor da base: ");
	double base = ler.nextDouble();
	System.out.println("\nDigite o valor da altura: ");
	double altura = ler.nextDouble();
	
	if(base<=0)
	{
		System.out.println("\nCalculo n�o realiz�vel");
	}
	if(altura<=0)
	{
		System.out.println("\nCalculo n�o realiz�vel.");
	}
	else if(base>=1 && altura>=1)
	{
		System.out.println("Curioso para saber a �rea do tri�ngulo?");
		double area = (base * altura)/2;
		System.out.println("\nO valor da �rea �: "+area);
	}
  }
}
