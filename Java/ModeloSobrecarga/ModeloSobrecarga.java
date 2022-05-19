package ModeloSobrecarga;

public class ModeloSobrecarga {
private int calc;
	
	public double soma(int n1, int n2)
	{
		int calc= n1+n2;
		return this.calc;	
	}
	
	public double soma(int n1,int n2, int n3)
	{
		int calc= n1+n2+n3;
		return this.calc;	
	}
	
	public double soma (double n1, double n2)
	{
		double calc= n1+n2;
		return this.calc;
	}

}
