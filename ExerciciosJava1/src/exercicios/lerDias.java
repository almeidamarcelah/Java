package exercicios;

import java.util.Scanner;

public class lerDias {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Ol�, qual seu nome?");
		String nome = ler.next();
		System.out.println("Quantos dias voc� tem?");
		int dias = ler.nextInt();
		System.out.println("Voc� tem "+ dias +" dias.");
		
		int totalAnos = (dias/365);
		int totalMeses =(dias/30);
		
		System.out.println("Seu total de anos na terra �: "+totalAnos+" anos,"+ totalMeses+ " meses, Parab�ns terraquio");
	}

}
