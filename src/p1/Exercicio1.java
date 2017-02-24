package p1;

public class Exercicio1 {

	static int[] vetor = new int[4];
	
	public static void main(String[] args) {

		for (int i = 0 ; i < 4 ; i++){
			Thread tCalcula = new Exercicio1Thread(vetor, i);
			tCalcula.start();
		}
		for (int i = 0 ; i < 4 ; i++){
			System.out.println(vetor[i]);
		}
		
	}

}
