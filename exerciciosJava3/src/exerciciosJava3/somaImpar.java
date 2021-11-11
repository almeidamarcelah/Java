package exerciciosJava3;

public class somaImpar {
	public static void main(String[] args) {
		int soma=0,numero;
		for(numero=1;numero<=500;numero++)
		{
			if((numero%2!=0) && (numero%3!=0))
			{
				soma =soma+numero;
				System.out.println("\n"+numero+" : "+soma);	
			}
			else
			{
				System.out.println("\n"+numero);
			}
			System.out.println("\nA soma dos números ímpares é: "+soma);
		}
	}

}
