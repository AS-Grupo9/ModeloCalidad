package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Splash {

	private JFrame frmCalidadDeSoftware;
	private JPanel panel_1;
	private int acumulado;
		
	public int getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(int acumulado) {
		this.acumulado += acumulado;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash window = new Splash();
					window.frmCalidadDeSoftware.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Splash() {
		initialize(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Splash frameInicial) {
		frmCalidadDeSoftware = new JFrame();
		frmCalidadDeSoftware.setTitle("Calidad de Software");
		frmCalidadDeSoftware.setBounds(100, 100, 450, 300);
		frmCalidadDeSoftware.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalidadDeSoftware.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frmCalidadDeSoftware.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnIniciar = new JButton("Comenzar");
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCalidadDeSoftware.setVisible(false);
				acumulado = 0;
				FuncionabilidadA funcA = new FuncionabilidadA(frameInicial);
			}
		});
		panel_1.add(btnIniciar);
		
		JLabel lblCalidadDeSoftware = new JLabel("CALIDAD DE SOFTWARE");
		lblCalidadDeSoftware.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblCalidadDeSoftware.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCalidadDeSoftware, BorderLayout.NORTH);
	}
}
