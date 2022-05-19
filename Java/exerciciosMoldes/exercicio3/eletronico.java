package exercicio3;

import java.util.Scanner;

public class eletronico {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		String c = null;
		String m = null;
		int me = 0;
		ModeloEletronico e1= new ModeloEletronico(c,m,me);
		
		System.out.print("Digite a cor do produto ");
		e1.cor= ler.next();
		
		System.out.print("Digite a marca do produto ");
		e1.marca= ler.next();
		
		System.out.print("Digita o espaça de memoria ");
		e1.memoria= ler.nextInt();
		
		System.out.println("\n");
		
		e1.escrever();

	}

}
