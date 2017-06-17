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

public class PortabilidadB {

	private JFrame frmCalidadDeSoftware;
	JRadioButton rdbtnBueno;
	//JRadioButton rdbtnRegular;
	JRadioButton rdbtnMalo;
	int contador, pregunta = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*FiabilidadA window = new FiabilidadA();
					window.frmCalidadDeSoftware.setVisible(true);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public PortabilidadB(Splash frameInicial) {
		frmCalidadDeSoftware = new JFrame();
		frmCalidadDeSoftware.setTitle("Calidad de Software");
		frmCalidadDeSoftware.setBounds(100, 100, 419, 208);
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
					frameInicial.setAcumPortabilidad(contador);
					PortabilidadC porC = new PortabilidadC(frameInicial);
					frmCalidadDeSoftware.dispose();
				}
			}
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnSiguiente);
		
		JPanel panel_1 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblFuncionabilidad = new JLabel("PORTABILIDAD - Adaptabilidad");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		panel_1.add(lblFuncionabilidad);
		
		JPanel panel_2 = new JPanel();
		frmCalidadDeSoftware.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblALuegoDe = new JLabel("<html>b) ¿El sistema posee la capacidad de funcionar en sistemas operativos x86 y x64?</html>");
		lblALuegoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblALuegoDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_2.add(lblALuegoDe, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		rdbtnMalo = new JRadioButton("No");
		rdbtnMalo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnMalo.setBounds(93, 29, 109, 23);
		panel_3.add(rdbtnMalo);
		
		//rdbtnRegular = new JRadioButton("Regular");
		//rdbtnRegular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//rdbtnRegular.setBounds(175, 29, 109, 23);
		//panel_3.add(rdbtnRegular);
		
		rdbtnBueno = new JRadioButton("Si");
		rdbtnBueno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnBueno.setBounds(241, 29, 109, 23);
		panel_3.add(rdbtnBueno);
		
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//rdbtnRegular.setSelected(false);
				rdbtnMalo.setSelected(false);
			}
		});
		
		
		/*rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnBueno.setSelected(false);
				rdbtnMalo.setSelected(false);
			}
		});*/
		

		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//rdbtnRegular.setSelected(false);
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
				contador+=10;
			//if(rdbtnRegular.isSelected())
			//	contador+=5;
			pregunta++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Debe seleccionar una opción para continuar.");
		}
	}
	
}

