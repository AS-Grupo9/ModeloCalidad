package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class ResultadoFinal extends JFrame {

	private JFrame fr;
	private JPanel contentPane;
	private int cantPreguntas = 15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*ResultadoFinal frame = new ResultadoFinal();
					frame.setVisible(true);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ResultadoFinal(Splash frameInicial) {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		fr.setContentPane(contentPane);
		contentPane.setLayout(null);
		fr.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 27);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCriterioDeAceptacion = new JLabel("Criterio de Aceptaci\u00F3n");
		lblCriterioDeAceptacion.setBounds(125, 0, 150, 25);
		panel.add(lblCriterioDeAceptacion);
		lblCriterioDeAceptacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 41, 414, 120);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEvaluaciónFinal = new JLabel("Evaluaci\u00F3n Final:");
		lblEvaluaciónFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEvaluaciónFinal.setBounds(10, 11, 150, 25);
		panel_1.add(lblEvaluaciónFinal);
		
		JLabel lblCalificacion = new JLabel("lblCalificacion");
		lblCalificacion.setBounds(10, 47, 110, 14);
		panel_1.add(lblCalificacion);
		
		JLabel lblCalificacionDetalle = new JLabel("lblCalificacionDetalle");
		lblCalificacionDetalle.setBounds(10, 72, 356, 14);
		panel_1.add(lblCalificacionDetalle);
		
		JLabel lblResultado = new JLabel("lblResultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(165, 16, 77, 14);
		panel_1.add(lblResultado);
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		lblResultado.setText(df.format(frameInicial.getAcumulado()/cantPreguntas));
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(335, 164, 89, 23);
		contentPane.add(btnNewButton);
		fr.setVisible(true);
	}
}
