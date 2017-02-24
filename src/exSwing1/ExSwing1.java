package exSwing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;

public class ExSwing1 extends JFrame {

	private JPanel contentPane;
	private JTextField tfFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExSwing1 frame = new ExSwing1();
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
	public ExSwing1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JProgressBar pbProgresso = new JProgressBar();
		pbProgresso.setBounds(10, 30, 165, 41);
		contentPane.add(pbProgresso);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(10, 228, 89, 23);
		contentPane.add(btnIniciar);
		
		tfFrase = new JTextField();
		tfFrase.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		tfFrase.setFont(new Font("Tahoma", Font.BOLD, 18));
		tfFrase.setBounds(10, 97, 165, 41);
		contentPane.add(tfFrase);
		tfFrase.setColumns(10);
		
		ActionListener iniciar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int numPalavra = 0;
				Thread exSwing1ThreadFrase = new ExSwing1ThreadFrase(pbProgresso, tfFrase, numPalavra);
				exSwing1ThreadFrase.start();
			}
		};
		
		btnIniciar.addActionListener(iniciar);
		
	}
}
