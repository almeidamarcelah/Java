package exercicios;
import java.util.Scanner;
public class lerIdade1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Ol�, qual seu nome?");
		String nome = ler.next();
		System.out.println("Quantos anos voc� tem?");
		int idade = ler.nextInt();
		System.out.println("Quantos meses voc� tem?");
		int meses = ler.nextInt();
		System.out.println("Quantos dias voc� tem?");
		int dias = ler.nextInt();
		System.out.println("Voc� tem "+ idade +" anos, "+ meses +" meses e "+ dias +" dias.");
		
		int totalDias = ((idade *365) + (meses *30) + dias);
		System.out.println("Seu total de dias na terra �: "+totalDias+" Parab�ns terraquio");
	}
}
