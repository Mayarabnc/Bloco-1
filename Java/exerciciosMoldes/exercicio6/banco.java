package exercicio6;

import java.util.Scanner;

public class banco {

	public static void main(String[] args) {
		
		String n=null;
		double s=0;
		double r=0;
		double d=0;
		double sf;
		Scanner ler= new Scanner(System.in);
		ModeloBanco c1= new ModeloBanco(n, s, r, d);
		
		System.out.print("Qual é o seu nome? ");
		c1.nome= ler.next();
		
		System.out.print("Qual  o seu saldo? ");
		c1.saldo=ler.nextDouble();
		
		System.out.print("Qual foi  o valor da retirada? ");
		c1.retirada= ler.nextDouble();
		
		System.out.print("Qual foi o valor do deposito? ");
		c1.depoito= ler.nextDouble();
		
	
		
		c1.escreva();
			
		sf= c1.saldo-c1.retirada+c1.depoito;
		
		System.out.println("\nSeu saldo agora é "+sf);
		
	}

}
