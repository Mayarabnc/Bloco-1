package exercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int n, resto, soma=0, contador=0; 
		double media;
		
		Scanner ler=new Scanner(System.in);
		
		do
		{
			System.out.print("Digite um numero: ");
			n=ler.nextInt();
			
			resto = n%3;
			
			if (resto==0 && n > 0)
			{
				soma += n;
				contador++;
				
			}
		}while(n!=0);
		
		media= soma/contador;
		System.out.println("A média dos numeros digitados é "+media);
		
	}

}
