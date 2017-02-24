package exercicios;

import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class SapoThread extends Thread{
	
	private JLabel lblSapo;
	private JTextArea taResultado;
	private JSeparator lblChegada;
	private int distanciaMaxima;
	private int tamanhoPulo;
	private int numSapo;
	private static String resultadoFinal;
	
	public SapoThread(int numSapo, JLabel lblSapo, JTextArea taResultado, JSeparator lblChegada){
		this.lblSapo = lblSapo;
		this.taResultado = taResultado;
		this.lblChegada = lblChegada;
		this.numSapo = numSapo; 
	}
	
	public void run(){
		if (resultadoFinal != null){	
			if (resultadoFinal.split("\n").length == 5){
				resultadoFinal = null;
			}
		}
		pulaSapo();
	}
	
	public void ranking(){
		StringBuffer sb = new StringBuffer();
		if (resultadoFinal != null){
			sb.append(resultadoFinal);
			sb.append("\n");
		}
		sb.append("Sapo ");
		sb.append(numSapo);
		resultadoFinal = sb.toString();
		taResultado.setText(resultadoFinal);
	}
	
	public int tempo(){
		int tempo = (int)((Math.random() * 50)+50);
		return tempo;
	}
	
	public int distancia(){
		Rectangle chegada = lblChegada.getBounds();
		return chegada.x;
	}
	
	public void pulaSapo(){
		distanciaMaxima = distancia();
		Rectangle sapo = lblSapo.getBounds();
		while (sapo.x + sapo.width < distanciaMaxima){
			tamanhoPulo = pulo();
			sapo.x += tamanhoPulo;
			lblSapo.setBounds(sapo);
			try {
				Thread.sleep(tempo());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ranking();
		
	}
	
	public int pulo(){
		int pulo = (int)((Math.random()*20)+5);
		return pulo;
	}

}
