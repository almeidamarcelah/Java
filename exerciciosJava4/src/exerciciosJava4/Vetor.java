package exerciciosJava4;

import java.util.Arrays;

public class Vetor {
	public static void main(String[] args) {
		String[] nomes =new String[] {"Jos�","Lucas","Marcela","Mirella","Ah ro"};
		
		System.out.println("\nNomes n�o ordenados");
		
		for(String nome:nomes)
		{
			System.out.println(nome);
		}
		System.out.println();
		Arrays.sort(nomes);
		
		System.out.println("\nNomes ordenados");
		
		for(String nome:nomes)
		{
			System.out.println(nome);
		}
		
	
	}

}
