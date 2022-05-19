/*
 Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
 */
package exercicio4;

public class ModeloFuncionario {
	String nome;
	int horas;
	int horasExtra;
	double salario;
	double salarioExtra;
	
	public ModeloFuncionario(String n, int he)
	{
		this.nome=n;
		this.horas=50;
		this.horasExtra=he;
		this.salario=500;
		this.salarioExtra=20;
	}
	
	public void extra()
	{
		if(horasExtra>0)
		{
			System.out.println(horasExtra*salarioExtra);
		}
		else 
		{
			System.out.println("Você não tem horas extras");
		
		}
	}
	public void escreva()
	{
		System.out.println("O nome do(a) funcionario(a) é "+ this.nome);
		
		System.out.println("Ele(a) trabalhou "+this.horas+" horas");
		
		System.out.println("Fez "+this.horasExtra+" horas extra");
		
		System.out.println("Seu salario fixo é de "+this.salario);
		
		System.out.println("Ele(a) tem que receber "+horasExtra*salarioExtra+" reais pelas horas extras");
	}
		

}
