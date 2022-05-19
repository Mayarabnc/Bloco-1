/*
 Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
 */
package exercicio6;

public class ModeloBanco {
	
	String nome;
	double saldo;
	double retirada;
	double depoito;

	public ModeloBanco(String n, double s, double r, double d)
	{
		this.nome = n;
		this.saldo = s;
		this.retirada = r;
		this.depoito = d;
	}
	
	public void escreva ()
	{
		System.out.println("O nome do titular da conta é "+this.nome);
		System.out.println("O saldo da conta é "+this.saldo);
		System.out.println("O valor retirado foi "+this.retirada);
		System.out.println("O valor depositado foi "+this.depoito);
	}
	

	

}
