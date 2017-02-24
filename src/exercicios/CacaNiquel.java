package exercicios;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CacaNiquel extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTela1;
	private JTextField tfTela2;
	private JTextField tfTela3;
	private JLabel lblCash;
	private JTextField tfCash;
	private JButton btnJogar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CacaNiquel frame = new CacaNiquel();
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
	public CacaNiquel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfTela1 = new JTextField();
		tfTela1.setHorizontalAlignment(SwingConstants.CENTER);
		tfTela1.setFont(new Font("Tahoma", Font.BOLD, 45));
		tfTela1.setEditable(false);
		tfTela1.setBounds(31, 77, 86, 87);
		contentPane.add(tfTela1);
		tfTela1.setColumns(10);
		
		tfTela2 = new JTextField();
		tfTela2.setHorizontalAlignment(SwingConstants.CENTER);
		tfTela2.setFont(new Font("Tahoma", Font.BOLD, 45));
		tfTela2.setEditable(false);
		tfTela2.setColumns(10);
		tfTela2.setBounds(161, 77, 86, 87);
		contentPane.add(tfTela2);
		
		tfTela3 = new JTextField();
		tfTela3.setHorizontalAlignment(SwingConstants.CENTER);
		tfTela3.setFont(new Font("Tahoma", Font.BOLD, 45));
		tfTela3.setEditable(false);
		tfTela3.setColumns(10);
		tfTela3.setBounds(295, 77, 86, 87);
		contentPane.add(tfTela3);
		
		lblCash = new JLabel("Cash");
		lblCash.setBounds(31, 11, 46, 14);
		contentPane.add(lblCash);
		
		tfCash = new JTextField();
		tfCash.setHorizontalAlignment(SwingConstants.RIGHT);
		tfCash.setText("10.00");
		tfCash.setEditable(false);
		tfCash.setBounds(93, 8, 86, 20);
		contentPane.add(tfCash);
		tfCash.setColumns(10);
		
		btnJogar = new JButton("Jogar");
		btnJogar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnJogar.setBounds(31, 212, 350, 39);
		contentPane.add(btnJogar);
		
		ActionListener joga = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Thread tJogo = new CacaNiquelThread(tfTela1, tfTela2, tfTela3, tfCash, btnJogar);
				tJogo.start();
			}
		};
		btnJogar.addActionListener(joga);
	}

}
