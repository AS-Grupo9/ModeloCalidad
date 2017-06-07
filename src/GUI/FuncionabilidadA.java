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

public class FuncionabilidadA {

	private JFrame frmCalidadDeSoftware;
	private int contador = 0, pregunta = 1;
	boolean respuesta;
	private JLabel lblALuegoDe;
	JRadioButton rdbtnMalo;
	JRadioButton rdbtnBueno;
	  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*FuncionabilidadA window = new FuncionabilidadA();
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
	public FuncionabilidadA(Splash frameInicial) {
		frmCalidadDeSoftware = new JFrame();
		frmCalidadDeSoftware.setTitle("Calidad de Software");
		frmCalidadDeSoftware.setBounds(100, 100, 450, 208);
		frmCalidadDeSoftware.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalidadDeSoftware.getContentPane().setLayout(new BorderLayout(0, 0));
		
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
				if(pregunta > 3)
				{
					if(contador > 1)
						frameInicial.setAcumulado(10);
					else if(contador > 0)
						frameInicial.setAcumulado(5);
					else
						frameInicial.setAcumulado(0);
					FuncionabilidadB funcB = new FuncionabilidadB(frameInicial);
					frmCalidadDeSoftware.dispose();
				}
			}
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnSiguiente);
		
		JPanel panel_1 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblFuncionabilidad = new JLabel("FUNCIONABILIDAD - Seguridad de Acceso");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		panel_1.add(lblFuncionabilidad);
		
		JPanel panel_2 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		lblALuegoDe = new JLabel("a) Luego de ocurrir un error en el sistema, \u00BFExiste protecci\u00F3n a los datos afectados? ");
		lblALuegoDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblALuegoDe.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblALuegoDe, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		rdbtnMalo = new JRadioButton("No");
		rdbtnMalo.setBounds(6, 29, 109, 23);
		panel_3.add(rdbtnMalo);
		/*
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setBounds(175, 29, 109, 23);
		panel_3.add(rdbtnRegular);
		*/
		rdbtnBueno = new JRadioButton("Sí");
		rdbtnBueno.setBounds(319, 29, 109, 23);
		panel_3.add(rdbtnBueno);
		
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	rdbtnRegular.setSelected(false);
				rdbtnMalo.setSelected(false);
			}
		});
		
		/*
		rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnBueno.setSelected(false);
				rdbtnMalo.setSelected(false);
			}
		});
		*/

		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	rdbtnRegular.setSelected(false);
				rdbtnBueno.setSelected(false);
			}
		});
		
		frmCalidadDeSoftware.setVisible(true);
	}
	
	private void botonSiguiente()
	{
		if(rdbtnBueno.isSelected() || rdbtnMalo.isSelected())
		{
			if(rdbtnBueno.isSelected())
				contador++;
			pregunta++;
			switch(pregunta)
			{
				case 2: lblALuegoDe.setText("b) \u00BFLos datos utilizados poseen una encriptaci\u00F3n segura? ");
						rdbtnBueno.setSelected(false);
						rdbtnMalo.setSelected(false);
						break;
				case 3: lblALuegoDe.setText("c) \u00BFExisten restricciones de accesos a funcionalidades de acuerdo a alg\u00FAn rol de usuario?");
						rdbtnBueno.setSelected(false);
						rdbtnMalo.setSelected(false);
						break;
				default: break;
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Debe seleccionar una opción para continuar.");
		}
	}
	
}
