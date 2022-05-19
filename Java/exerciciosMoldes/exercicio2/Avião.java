package exercicio2;

import java.util.Scanner;

public class Avi„o {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int l=0;
		ModeloAvi„o a1= new ModeloAvi„o(l);
		
		System.out.print("Digite a lota«„o do avi„o em porcentagem: ");
		a1.lotacao= ler.nextInt();
		
		a1.escreva();
		}

}
