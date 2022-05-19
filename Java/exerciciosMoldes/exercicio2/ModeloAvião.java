/*
 Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package exercicio2;

public class ModeloAvião {
	
	int combustivel;
	int acentos;
	int lotacao;

	boolean voa;

	public ModeloAvião ( int l)
	{   
		
		this.combustivel=100;
		this.acentos=150;
		this.lotacao=l;
		this.voa=true;
		
		
	}
	
	public void fale()
	{
		if(lotacao==100)
		{
			System.out.println("O avião eata cheio ");
		}
		
		else if (lotacao==0)
		{
			System.out.println("O avião esta vazio");
		}
		else
		{
			System.out.println("Ainda há espaço no avião");
		}
	}
	
	public void escreva(){	
		
		{
			
			System.out.println("O avião esta com "+this.combustivel+" % de combustivel");
			System.out.println("O numero de acentos total é "+this.acentos);
			System.out.println("A lotação é de "+this.lotacao+" %");
			System.out.println("voa?"+this.voa);
	
			
		}
		}

}
