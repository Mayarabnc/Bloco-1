/*
 Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */
package exercicio;
import java.util.Scanner;
public class categotia {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade= ler.nextInt();
				
	if (idade >=10 && idade<=14)	
	{
		System.out.println("Sua categoria é a infantil");
	}
	else if(idade >=15 && idade <=17)
	{
		System.out.println("Sua categoria é a juvenil");
	}
	else if (idade >=18 && idade <=25)
	{
		System.out.println("Sua categoria é adulto");
	}
	else 
	{
		System.out.println("Desculpe, sua idade não se enquadra em nenhuma categoria");
	}
	}

}
