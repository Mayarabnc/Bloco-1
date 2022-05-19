/*
 Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int idade, menor21=0, maior50=0;
		
		System.out.println("Digite a idade: ");
		idade=ler.nextInt();
		
			while (idade !=-99)
		{
					if(idade <21 && idade>=0)
					{
						menor21++;
					}
					
					if (idade >50)
					{
						maior50++;
					}
					System.out.println("Digite outra idade: ");
					idade=ler.nextInt();
		
		
		}
		System.out.println(menor21+" pessoas são menores de 21 anos");
		System.out.print(" e "+maior50+" pessoas são maiores de 50 anos");

	}

}
