/*
 Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */
package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int n; 
		
 		for (n=1000; n<=1999; n++)
		{
			if(n%11 ==5)
			System.out.println(n);
		}
      
	}

}
