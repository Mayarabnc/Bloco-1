/*
 Faça um programa que entre com três números e coloque em ordem crescente.
 */
package exercicio;
import java.util.Scanner;
public class ordem {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int a,b,c;
		
		System.out.print("Digite o primeiro numero: ");
		a=ler.nextInt();
					
		System.out.print("Digite o segundo numero: ");
		b=ler.nextInt();
					
		System.out.print("Digite o terceiro numero: ");
		c=ler.nextInt();
		
		if (a<=b && a<=c && b<=c)
		{
			System.out.println("A ordem crescente é:"+a+b+c);
		}
		else if (a<=b && a<=c && c<=b )
		{
			System.out.println("A ordem crescente é:"+a+c+b);
		}
		else if (b<=a && b<=c && a<=c)
		{
			System.out.println("A ordem crescente é:"+b+a+c);
		}
		else if (b<=a && b<=c && c<=a)
		{
			System.out.println("A ordem crescente é:"+b+c+a);
		}
		else if (c<a && c<b && b<a)
		{
			System.out.println("A ordem crescente é:"+c+b+a);
		}
		else if(c<a && c<b && a<b)
		{
			System.out.println("A ordem crescente é:"+c+a+b);
		}

	}

}