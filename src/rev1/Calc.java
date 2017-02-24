package rev1;

import java.util.concurrent.Semaphore;

public class Calc {

	static int[][] mat;
	static int[] vet;
	static Semaphore semaforo;
	
	public static void main(String[] args) {

		mat = new int[3][5];
		vet = new int[5];
		semaforo = new Semaphore(1);
		
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 5 ; j++){
				mat[i][j] = (int)((Math.random()*10)+1);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++){
			Thread tCalc = new ThreadCalc(mat[i],i,semaforo);
			tCalc.start();
		}

	}
}
