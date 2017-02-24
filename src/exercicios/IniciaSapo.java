package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class IniciaSapo implements ActionListener {

	private JLabel lblSapo1;
	private JLabel lblSapo2;
	private JLabel lblSapo3;
	private JLabel lblSapo4;
	private JLabel lblSapo5;
	private JTextArea taResultado;
	private JSeparator separator;
	private JButton btnIniciar;
	private JButton btnReiniciar;
	
	public IniciaSapo(JLabel lblSapo1, JLabel lblSapo2, JLabel lblSapo3,
			JLabel lblSapo4, JLabel lblSapo5, JTextArea taResultado,
			JSeparator separator, JButton btnIniciar, JButton btnReiniciar) {
		this.lblSapo1 = lblSapo1;
		this.lblSapo2 = lblSapo2;
		this.lblSapo3 = lblSapo3;
		this.lblSapo4 = lblSapo4;
		this.lblSapo5 = lblSapo5;
		this.taResultado = taResultado;
		this.separator = separator;
		this.btnIniciar = btnIniciar;
		this.btnReiniciar = btnReiniciar;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Thread t1 = new SapoThread(1, lblSapo1, taResultado, separator);
		Thread t2 = new SapoThread(2, lblSapo2, taResultado, separator);
		Thread t3 = new SapoThread(3, lblSapo3, taResultado, separator);
		Thread t4 = new SapoThread(4, lblSapo4, taResultado, separator);
		Thread t5 = new SapoThread(5, lblSapo5, taResultado, separator);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		btnIniciar.setVisible(false);
		btnReiniciar.setVisible(true);		
	}
}
