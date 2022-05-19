/*
 Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
package exercicios;

import java.util.Scanner;

public class execicio2 {

	public static void main(String[] args) {
		int n, par=0, impar=0, d; 
		Scanner ler = new Scanner (System.in);
		
		for(n=0; n<= 10;n++)
		{	
			System.out.print("digite um numero: ");
			n=ler.nextInt();
			d= n%2;
			
			if (d==1)
			{
				impar= impar+1;
			}
			
			if (d==0)
				{
				par= par+1;
				}
		}
		System.out.println(impar +" são impares");
		System.out.println(par+" são pares ");
 
	}

}
