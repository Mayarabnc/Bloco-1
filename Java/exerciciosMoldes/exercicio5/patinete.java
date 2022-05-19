package exercicio5;

import java.util.Scanner;

public abstract class patinete {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		String c= null;
		boolean e = false;
		ModeloPatinete p1= new ModeloPatinete(e, c);
		
		System.out.print("Digite a cor do patinete ");
		p1.cor=ler.next();
		
		System.out.print("Ele é eletrico? (escrevav true ou false) ");
		p1.eletrico= ler.hasNext();
		
		
		
		p1.escreva();

	}

}
