package exaula;

public class ThreadPalavra extends Thread {

	private int pos;
	private String palavra;

	public ThreadPalavra(int pos, String palavra) {
		this.pos = pos;
		this.palavra = palavra;
	}

	@Override
	public void run() {
		contaPalavra();
	}

	private void contaPalavra() {
		int tamanho = palavra.length();
		StringBuffer sb = new StringBuffer();
		sb.append("Posi��o: " + pos + "\r\n");
		sb.append("Palavra: " + palavra + "\r\n");
		sb.append("N�mero de Letras: " + tamanho + "\r\n");
		System.out.println(sb.toString());
	}

//	private void contaPalavra() {
//		int tamanho = palavra.length();
//		System.out.println("Posi��o: " + pos);
//		System.out.println("Palavra: " + palavra);
//		System.out.println("N�mero de Letras: " + tamanho);
//		System.out.println("");
//	}

}
