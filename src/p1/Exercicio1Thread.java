package p1;

public class Exercicio1Thread extends Thread{

	private int[] vetor;
	private int idThread;
	
	public Exercicio1Thread(int[] vetor, int idThread){
		this.vetor = vetor;
		this.idThread = idThread;
	}
	
	public void run(){
		calcula();
	}
	
	public void calcula(){
		int numero = (int)((Math.random() * 3) + 1);
		vetor[idThread] = numero;
	}
	
}
