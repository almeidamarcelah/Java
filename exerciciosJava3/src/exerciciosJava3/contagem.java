package exerciciosJava3;

public class contagem {
	public static void main(String[] args) {
		int valor=233;
		System.out.println(valor+"\n");
		
		do
		{
			if(valor>=300 && valor<=400)
			{
				valor=valor+3;
			}
			else
			{
				valor=valor+5;
			}
			if(valor<=456)
			{
				System.out.println(valor+"\n");
			}
		}
		while(valor<=456);
	}
}
