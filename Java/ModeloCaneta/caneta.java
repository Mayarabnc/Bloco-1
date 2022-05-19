package ModeloCaneta;

public class caneta {

	public static void main(String[] args) {
		
			ModeloCaneta c1=new ModeloCaneta("vermelha", 0.7);
			ModeloCaneta c2=new ModeloCaneta("preta", 1.0);
			
			
			c1.cor= "preta";
			c1.ponta= 1.0;
			c1.carga= 50;
			
			c2.cor= "vermelha";
			c2.ponta= 0.7;
			c2.carga= 50;
			
			c1.estado();
			c2.estado();
			
	}

}
