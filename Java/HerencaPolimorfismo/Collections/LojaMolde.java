

public class LojaMolde {
	
	private String produtos;
	private int quantidade;
	
	public LojaMolde (String p, int q)
	{
		this.produtos = p;
		this.quantidade = q;
	}
	
	public String getProdutos() {
		return produtos;
	}



	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public String toString ()
	{
		return this.produtos + ": " + this.quantidade;
	}

}
