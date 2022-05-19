package exercicio7;

import java.util.Scanner;

public class paciente {

	public static void main(String[] args) {
		
		String n = null;
		boolean g = false;
		int i = 0;
		double p = 0;
		
		
		ModeloPaciente p1= new ModeloPaciente(n, g, i, p);
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite o nome do(a) paciente ");
		p1.nome=ler.next();
		
		System.out.println("Digite a idade do(a) paciente ");
		p1.idade= ler.nextInt();
		
		System.out.println("Quanto o paciente pesa? ");
		p1.peso= ler.nextDouble();
		
		System.out.println("O estado é grave?(digite true ou false)");
		p1.grave= ler.hasNext();
		
		
		
		
		p1.escreva(n, n, i, p);
		
		
	}

}
