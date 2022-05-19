package exercicio1;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		
		Scanner ler= new Scanner(System.in);
		String n = null;
		String t = null;
		String f = null;
		ModeloCliente c1= new ModeloCliente(n, t, f);
		
		
		System.out.print("Digite o nome do cliente: ");
		c1.nome=ler.next();
		
		System.out.print("Digite o tamanho da roupa (p, m, g ou gg): ");
		c1.tamanhoRoupa=ler.next();
		
		System.out.print("Digite a forma de pagamento ");
		c1.formaDePagamento=ler.next();
		
		c1.escreva();
		
		
		
		
	}

}
