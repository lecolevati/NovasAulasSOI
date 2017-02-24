package p1;

public class Exercicio2ThreadEsc extends Thread{

	private int[] vetor;

	public Exercicio2ThreadEsc(int[] vetor, int idThread){
		this.vetor = vetor;
	}
	
	public void run(){
	
		for (int i = 0 ; i < 4 ; i++){
			Thread tCalcula = new Exercicio2Thread(vetor, i);
			tCalcula.start();
		}

		
		
	}
	
	
}
