package ModeloCaneta;

public class ModeloCaneta {
	String cor;
	double ponta;
	int carga;
	boolean tampa;
	
	public ModeloCaneta(String c, double p)
	{
		this.cor=c;
		this.ponta=p;
		this.tampa=true;
		this.carga=100;

	}
	
	public void escreva()
	{
		if (tampa==true)
		{
			System.out.println("Erro caneta tampada");
		}
		else 
		{
			System.out.println("Escrevendo...");
		}
	}
	
	public void tampa()
	{
		this.tampa=true;
	}
	
	public void destampar()
	{
		this.tampa=false;
	}
	
	public void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Está tampada? "+this.tampa);
		System.out.println("A carga está em  "+this.carga);
	}
}
