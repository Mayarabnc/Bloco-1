package exercicio;
/*
 Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
import java.util.Scanner;
public class maior {

public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	int n1, n2, n3;		
	System.out.print("Digite o primeiro numero: ");
	n1=ler.nextInt();
				
	System.out.print("Digite o segundo numero: ");
	n2=ler.nextInt();
				
	System.out.print("Digite o terceiro numero: ");
	n3=ler.nextInt();
				
	if (n1>n2 && n1>n3)
		{
			System.out.println("O maoir numero é: "+n1);
		}
				
	else if (n2>n1 && n2>n3)
		{
			System.out.println("O maoir numero é: "+n2);
		}
	else 
		{
			System.out.println("O maoir numero é: "+n3);
		}
			}
	}