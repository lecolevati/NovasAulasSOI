package iniciais;

public class ExemplosIniciais {

	public static void main(String[] args) {
		TempoBuffer tb = new TempoBuffer();
		tb.tempoString();
		tb.tempoStringBuffer();

		String frase = "Teste de frase";
		Caracteres c = new Caracteres();
		c.quebraFrase(frase);
	}

}
