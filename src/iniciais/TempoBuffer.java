package iniciais;

public class TempoBuffer {

	public TempoBuffer() {
		super();
	}

	public void tempoString(){
		String a = "";
		double tempoInicial = System.nanoTime();
		for (int i = 0 ; i <= 32768 ; i++){
			a = a + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("String ==> "+ tempoTotal +" segundos");
	}
	
	public void tempoStringBuffer(){
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0 ; i <= 32768 ; i++){
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("StringBuffer ==> "+ tempoTotal +" segundos");
	}
}
