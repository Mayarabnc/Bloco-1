package exercicio4;

import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		String n=null;
		int he=0;
		ModeloFuncionario f1= new ModeloFuncionario(n,he);
		
		System.out.print("Digite o nome do(a) funcionario(a) ");
		f1.nome= ler.next();
		
		System.out.println("Digite quantas horas ele(a) ficou a mais ");
		f1.horasExtra= ler.nextInt();
		
		f1.escreva();
	}

}
