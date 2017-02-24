package semaforos;

public class EstaticoThread extends Thread{
	
	static float x;
	int idThread;
	
	public EstaticoThread(int idThread){
		this.idThread = idThread;
	}
	
	public void run(){
		conta();
	}
	
	public void conta(){
		if (idThread % 2 == 0){
			for (int i = 1 ; i < 10 ; i++){
				x = (float) (x + Math.pow(idThread, i));
				System.out.println(x);
			}
		} else {
			for (float i = 1 ; i < 10 ; i++){
				x = x + (1 / i); 
				System.out.println(x);
			}
		}
	}

}
