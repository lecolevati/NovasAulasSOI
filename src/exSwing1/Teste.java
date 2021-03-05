package exSwing1;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class Teste extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 132, 98, 49);
		contentPane.add(lblNewLabel);
		
		final JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 35, 188, 42);
		contentPane.add(progressBar);
		
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.setBounds(10, 228, 89, 23);
		contentPane.add(btnIncio);
		
		final Thread tBarra = new Thread(){
			public void run(){
				for (int i = 1 ; i <= 100 ; i++){
					progressBar.setValue(i);
					try{
						Thread.sleep(20);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		};
		
		final Thread tLabel = new Thread(){
			public void run(){
				int contador = 1;
				String texto = "";
				while (tBarra.isAlive()){
					switch (contador) {
						case 1:
							texto = "Boa";
							break;
						case 2:
							texto = "Tarde";
							break;
						case 3:
							texto = "Galera";
					}
					lblNewLabel.setText(texto);
					
					contador++;
					if (contador == 4){
						contador = 1;
					}
					try{
						Thread.sleep(100);
					} catch (InterruptedException ex){
						ex.printStackTrace();
					}
				}
				
			}
		};
		
		btnIncio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tBarra.start();
				tLabel.start();
			}
		});
		
	}
}
