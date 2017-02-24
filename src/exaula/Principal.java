package exaula;

public class Principal {

	public static void main(String[] args) {
		String[] vetPalavras = {"Filtro", "Linha",
				"Projetor", "Computador", "Teclado",
				"Mouse"};
		int pos = 0;
		for (String s : vetPalavras){
			Thread t = new ThreadPalavra(pos, s);
			t.start();
			pos++;
		}
	}
	
}
