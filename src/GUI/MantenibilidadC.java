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

public class MantenibilidadC {

	private JFrame frmCalidadDeSoftware;
	JRadioButton rdbtnBueno;
	JRadioButton rdbtnRegular;
	JRadioButton rdbtnMalo;
	int contador, pregunta = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*MantenibilidadC window = new MantenibilidadC();
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
	public MantenibilidadC(Splash frameInicial) {
		frmCalidadDeSoftware = new JFrame();
		frmCalidadDeSoftware.setTitle("Calidad de Software");
		frmCalidadDeSoftware.setBounds(100, 100, 549, 208);
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
			public void actionPerformed(ActionEvent e) {
				botonSiguiente();
				if(pregunta > 0)
				{
					
					frameInicial.setAcumulado(contador);
					frameInicial.setAcumMantenibilidad(contador);
					UsabilidadA usaB = new UsabilidadA(frameInicial);
					frmCalidadDeSoftware.dispose();
					
					
				}
			}
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnSiguiente);
		
		JPanel panel_1 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblFuncionabilidad = new JLabel("MANTENIBILIDAD - Capacidad del c\u00F3digo para ser cambiado");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		panel_1.add(lblFuncionabilidad);
		
		JPanel panel_2 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblALuegoDe = new JLabel("a) \u00BFCu\u00E1l es el n\u00FAmero de complejidad ciclom\u00E1tica del c\u00F3digo?");
		lblALuegoDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblALuegoDe.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblALuegoDe, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		rdbtnMalo = new JRadioButton("Mayor a 20");
		rdbtnMalo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnMalo.setBounds(6, 7, 260, 23);
		panel_3.add(rdbtnMalo);
		
		rdbtnRegular = new JRadioButton("Entre 20 y 10");
		rdbtnRegular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnRegular.setBounds(6, 29, 260, 23);
		panel_3.add(rdbtnRegular);
		
		rdbtnBueno = new JRadioButton("Menor a 10");
		rdbtnBueno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnBueno.setBounds(6, 55, 260, 23);
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

	/**
	 * @wbp.parser.entryPoint
	 */
	private void botonSiguiente()
	{
		if(rdbtnBueno.isSelected() || rdbtnMalo.isSelected() || rdbtnRegular.isSelected())
		{
			if(rdbtnBueno.isSelected())
				contador+=10;
			if(rdbtnRegular.isSelected())
				contador+=5;
			pregunta++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Debe seleccionar una opci�n para continuar.");
		}
	}
	
}

