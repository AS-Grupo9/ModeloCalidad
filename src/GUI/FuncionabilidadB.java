package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class FuncionabilidadB {

	private JFrame frmCalidadDeSoftware;
	JRadioButton rdbtnMalo;
	JRadioButton rdbtnRegular;	
	JRadioButton rdbtnBueno;
	private int puntaje;
	private int contador = 0, pregunta = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*FuncionabilidadB window = new FuncionabilidadB();
					window.frmCalidadDeSoftware.setVisible(true);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public FuncionabilidadB(Splash frameInicial) {
		frmCalidadDeSoftware = new JFrame();
		frmCalidadDeSoftware.setTitle("Calidad de Software");
		frmCalidadDeSoftware.setBounds(100, 100, 450, 208);
		frmCalidadDeSoftware.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalidadDeSoftware.getContentPane().setLayout(new BorderLayout(0, 0));
		frmCalidadDeSoftware.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		panel.add(btnSalir);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonSiguiente();
				if(pregunta > 0)
				{
					frameInicial.setAcumulado(contador);
					EficienciaA efiA = new EficienciaA(frameInicial);
					frmCalidadDeSoftware.dispose();
				}
			}
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnSiguiente);
		
		JPanel panel_1 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblFuncionabilidad = new JLabel("FUNCIONABILIDAD - Exactitud de resultados");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		panel_1.add(lblFuncionabilidad);
		
		JPanel panel_2 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblALuegoDe = new JLabel("d) \u00BFQu\u00E9 grado de precisi\u00F3n poseen las diferentes funcionalidades de la aplicaci\u00F3n?");
		lblALuegoDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblALuegoDe.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblALuegoDe, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		rdbtnMalo = new JRadioButton("Error mayor a 10ˉ³");
		rdbtnMalo.setBounds(6, 7, 280, 23);
		panel_3.add(rdbtnMalo);
		
		rdbtnRegular = new JRadioButton("Error entre 10ˉ⁴ y 10ˉ⁶");
		rdbtnRegular.setBounds(6, 29, 280, 23);
		panel_3.add(rdbtnRegular);
		
		rdbtnBueno = new JRadioButton("Error menor a 10ˉ⁷");
		rdbtnBueno.setBounds(6, 55, 280, 23);
		panel_3.add(rdbtnBueno);
		
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnRegular.setSelected(false);
				rdbtnMalo.setSelected(false);
			}
		});
		
		
		rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnBueno.setSelected(false);
				rdbtnMalo.setSelected(false);
			}
		});
		

		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnRegular.setSelected(false);
				rdbtnBueno.setSelected(false);
			}
		});
		
		frmCalidadDeSoftware.setVisible(true);
	}

	private void botonSiguiente()
	{
		if(rdbtnBueno.isSelected() || rdbtnRegular.isSelected() || rdbtnMalo.isSelected())
		{
			if(rdbtnBueno.isSelected())
				contador+=10;
			if(rdbtnRegular.isSelected())
				contador+=5;
			pregunta++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Debe seleccionar una opción para continuar.");
		}
	}
}
