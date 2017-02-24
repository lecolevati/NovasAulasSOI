package exercicios;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CorridaSapo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblSapo1;
	private JLabel lblSapo2;
	private JTextArea taResultado;
	private JSeparator separator;
	private JLabel lblSapo3;
	private JLabel lblSapo4;
	private JLabel lblSapo5;
	private JButton btnReiniciar;
	private JButton btnIniciar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorridaSapo frame = new CorridaSapo();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CorridaSapo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 525);
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(648, 11, 9, 464);
		panel.add(separator);
		
		lblSapo1 = new JLabel("Sapo1");
		lblSapo1.setBounds(33, 369, 64, 48);
		panel.add(lblSapo1);
		lblSapo1.setIcon(new javax.swing.ImageIcon("sapo1.jpg"));
		
		lblSapo2 = new JLabel("Sapo2");
		lblSapo2.setBounds(33, 319, 64, 48);
		panel.add(lblSapo2);
		lblSapo2.setIcon(new javax.swing.ImageIcon("sapo2.jpg"));
		
		taResultado = new JTextArea();
		taResultado.setFont(new Font("Arial", Font.BOLD, 18));
		taResultado.setBackground(new Color(255, 255, 255));
		taResultado.setEditable(false);
		taResultado.setBounds(251, 11, 117, 141);
		panel.add(taResultado);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(10, 11, 89, 23);
		panel.add(btnIniciar);
		
		lblSapo3 = new JLabel("Sapo3");
		lblSapo3.setBounds(33, 279, 64, 48);
		panel.add(lblSapo3);
		lblSapo3.setIcon(new javax.swing.ImageIcon("sapo3.jpg"));
		
		lblSapo4 = new JLabel("Sapo4");
		lblSapo4.setBounds(33, 239, 64, 48);
		panel.add(lblSapo4);
		lblSapo4.setIcon(new javax.swing.ImageIcon("sapo4.jpg"));
		
		lblSapo5 = new JLabel("Sapo5");
		lblSapo5.setBounds(33, 199, 64, 48);
		panel.add(lblSapo5);
		lblSapo5.setIcon(new javax.swing.ImageIcon("sapo5.jpg"));
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setBounds(10, 11, 89, 23);
		panel.add(btnReiniciar);
		btnReiniciar.setVisible(false);

		ActionListener inicia = new IniciaSapo(lblSapo1, lblSapo2, lblSapo3, lblSapo4, lblSapo5, taResultado, separator, btnIniciar, btnReiniciar);		
		ActionListener reinicia = new ReiniciaSapo(this);
		btnIniciar.addActionListener(inicia);
		btnReiniciar.addActionListener(reinicia);
	}
}
