/*
 1.Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
Animal:
2.Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.
 */
package exercicio1;

public class Animal {
	
	String nome;
	int idade;
	
	public void emitirSom()
	{
		System.out.println("Emitindo o som caracterisco...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
