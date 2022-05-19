/*
 Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */
package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int idade, sexo, opcao, pessoas=0;
		int contPC=0, contMN=0, contHA=0, contOC=0, contPN40=0, contPC18=0, contInt=0;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade= ler.nextInt();
		
		System.out.println("Digite seu sexo entre as opções;");
		System.out.println("1- Feminino/ 2- Masculino/ 3- outro");
		sexo=ler.nextInt();
		
		System.out.println("Digite seu estado entre as opções; ");
		System.out.println("1- Calmo(a)/ 2- Nervoso(a)/ 3- Agressivo(a)");
		opcao= ler.nextInt();
		
		
		while ( contInt <150 && idade>=1 && sexo>=1 && sexo<=3 && opcao>=1 && opcao<=3)
		{
			contInt++;
		
			if(opcao == 1)	
			{
				contPC++;
			}
		
			if(sexo==1 && opcao==2)
			{
				contMN++;
			}
		
			if(sexo==2 && opcao==3)
			{
				contHA++;
			}
		
			if(sexo==3 && opcao==1)
			{
				contOC++;
			}
		
			if(opcao==1 && idade >40)
			{
				contPN40++;
			}
		
			if(opcao== 1 && idade <18)
			{
				contPC18++;
			}
			
			
			System.out.println("Digite a sua idade: ");
			idade= ler.nextInt();
			
			System.out.println("Digite seu sexo entre as opções;");
			System.out.println("1- Feminino/ 2- Masculino/ 3- outro");
			sexo=ler.nextInt();
			
			System.out.println("Digite seu estado entre as opções; ");
			System.out.println("1- Calmo(a)/ 2- Nervoso(a)/ 3- Agressivo(a)");
			opcao= ler.nextInt();
			
			System.out.println("O numero de pessoas calmas é "+contPC);
			
			System.out.println("O numero de mulheres nervosas é de "+contMN);
			
			System.out.println("O numero de homens agressisvos é de "+contHA);
			
			System.out.println("O numero de outros sexos calmos é de "+contOC);
			
			System.out.println("O numero de pessoas nervosas com mais de 40 anos é "+contPN40);
			
			System.out.println("O numero de pessoas calmas com menos de 18 anos é "+contPC18);
			
					
		}
		System.out.println("Fim do programa1");
		
		
	}
	
}
