package Exercicios2;

import java.util.Scanner;

public class salarioExcedente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com seu c�digo: ");
		int codigo = ler.nextInt();
		System.out.println("\nInsira o total de horas trabalhadas: ");
		double horas = ler.nextDouble();
		double salario = 500;
		double excesso = horas - 50;
		
		System.out.println("\nC�digo: "+codigo);	
		if (horas>50)
		{
			System.out.println("\nO valor do seu salario �: "+salario);
			System.out.println("Voc� possui horas excedidas.");
			double salario2 = (excesso * 20);
			System.out.println("Suas horas excedidas s�o: "+excesso+" horas.");
			System.out.println("\nO valor do seu sal�rio excedente �: "+salario2+" reais.");
			double total = salario + salario2;
			System.out.println("O valor total do seu sal�rio �: "+total+" reais.");
		
		}
		else
		{
			System.out.println("\nValor do seu sal�rio �: "+salario);
		}
	}

}
