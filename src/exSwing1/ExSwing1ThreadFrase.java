package exSwing1;

import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class ExSwing1ThreadFrase extends Thread{

	private JTextField tfFrase;
	private JProgressBar pbProgresso;
	private int numPalavra;
	
	public ExSwing1ThreadFrase(JProgressBar pbProgresso, JTextField tfFrase, int numPalavra){
		this.tfFrase = tfFrase;
		this.numPalavra = numPalavra;
		this.pbProgresso = pbProgresso;
	}
	
	public void run(){
		Thread exSwingThreadPB = new ExSwing1ThreadPB(pbProgresso);
		exSwingThreadPB.start();
		while (exSwingThreadPB.isAlive()){
			switch(numPalavra){
			case 0:
				tfFrase.setText("Boa");
				numPalavra++;
				break;
			case 1:
				tfFrase.setText("Tarde");
				numPalavra++;
				break;
			case 2:
				tfFrase.setText("Turma");
				numPalavra = 0;
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
