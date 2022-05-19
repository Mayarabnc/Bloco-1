/* 7) Crie uma classe paciente e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto paciente, 
	 * defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console. */
package exercicio7;

public class ModeloPaciente {
	
		
		String nome;
		boolean grave;
		int idade;
		double peso;
		
		public ModeloPaciente(String n, boolean g, int i, double p )
		{
			this.nome=n;
			this.grave=g;
			this.idade=i;
			this.peso=p;
		}
		
		
		public void gravidade() 
		{
			if (grave == true) 
			{
				System.out.println("EMERGENCIA!!!!");
			}
			else
			{
				System.out.println("Espere um momento");

			}
		}
		public void escreva (String  n, String d, int i, double p) 
		{
			System.out.println("Nome do paciente: " + this.nome);
			System.out.println("O estado é grave? " + this.grave);
			System.out.println("A idade do paciente: " + this.idade);
			System.out.println("Peso do paciente: "+ this.peso);
		}
	}

