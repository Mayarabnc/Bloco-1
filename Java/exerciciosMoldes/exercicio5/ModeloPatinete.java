/*
 Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package exercicio5;

public class ModeloPatinete {
	
	boolean eletrico;
	String cor;
	int peso;
	
	public ModeloPatinete(boolean e, String c)
	{
		this.cor=c;
		this.eletrico=e;
		this.peso= 150;
	}
	
	public void vrum()
	{
		if(eletrico==true)
		{
			System.out.println("vruuuuuummmmmmm");
		}
		else
		{
			System.out.println("Que canseira");
		}
	}
	
	public void escreva()
	{
		System.out.println("A cor é "+this.cor);
		System.out.println("Ele é eletrico? "+this.eletrico);
		System.out.println("Ele aguenta até "+this.peso);
	}

}
