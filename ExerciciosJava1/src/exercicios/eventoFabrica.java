package exercicios;
import java.util.Scanner;

public class eventoFabrica {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Ol�, o evento das Americas come�ou as 00h, gostaria de saber o tempo de dura��o?");
		System.out.println("Por favor, insira seu horario atual.");
		int horas = ler.nextInt();
		horas = (horas - 00);
		int minutos =(horas * 60);
		int segundo = (minutos *60);
		System.out.println(" O evento tem, "+horas+" horas de dura��o;");
		System.out.println("O evento tem, "+minutos+" minutos de dura��o;");
		System.out.println("O evento tem, "+ segundo+" segundo de dura��o");
	}

}
