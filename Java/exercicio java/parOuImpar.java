/*
 Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
package exercicio;
import java.util.Scanner;
public class parOuImpar {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double n;
		
		System.out.print("Digite um numero: ");
		n=ler.nextDouble();
		
		if ( n%2 == 1 )
		{
			n= Math.sqrt(n);
			System.out.println("Esse numero é impar");
			System.out.println(n);
		}
		
		else if( n%2==0)
		{
			n=Math.pow(n, 2);
			System.out.println("Esse numero é par");
			System.out.println(n);
		}
	
				
	
	
	}

}
