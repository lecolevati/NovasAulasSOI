package iniciais;

public class Caracteres {

	public Caracteres() {
		super();
	}
	
	public void quebraFrase(String frase){
		String[] vetFrase = frase.split(" ");
		for (String s : vetFrase){
			System.out.println(s);
		}
	}
	
}
