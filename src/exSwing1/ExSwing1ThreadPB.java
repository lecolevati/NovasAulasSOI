package exSwing1;

import javax.swing.JProgressBar;

public class ExSwing1ThreadPB extends Thread{
	
	private JProgressBar pbProgresso;
	
	public ExSwing1ThreadPB(JProgressBar pbProgresso){
		this.pbProgresso = pbProgresso;
	}
	
	public void run(){
		pbProgresso.setValue(0);
		for (int i = 0 ; i <= 100 ; i++){
			pbProgresso.setValue(i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
