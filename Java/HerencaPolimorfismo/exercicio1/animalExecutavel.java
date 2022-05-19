package exercicio1;

public class animalExecutavel {

	public static void main(String[] args) {
	
		cachorro au= new cachorro();
		cavalo hi= new cavalo();
		preguica zz= new preguica();
		
		au.corre();
		System.out.println("O cachorro respondeu ");
		au.emitirSom();
		
		System.out.println();
		
		hi.corre();
		System.out.println("O cavalo respondeu ");
		hi.emitirSom();
		System.out.println();
		
		zz.corre();
		System.out.println("A preguiça respondeu ");
		zz.emitirSom();

	}

}
