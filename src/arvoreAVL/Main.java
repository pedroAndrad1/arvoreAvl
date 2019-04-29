package arvoreAVL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreAvl a = new ArvoreAvl();
		
		a.inserir(13);
		a.inserir(123);
		a.inserir(11);
		a.inserir(134);
		a.inserir(1);
		a.inserir(3);
		
		a.printAvl();
		
		a.remover(13);
		a.remover(134);
		System.out.println();
		System.out.println();
		a.printAvl();
		
	}

}
