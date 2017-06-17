package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ResultadoFinal extends JFrame {

	private JFrame fr;
	private JPanel contentPane;
	private int cantPreguntas = 24;	//15
	private int cantPreguntasFuncionalidad = 4;
	private int cantPreguntasEficiencia = 3;
	private int cantPreguntasFiabilidad = 5;
	private int cantPreguntasMantenibilidad = 3;
	private int cantPreguntasPortabilidad = 5;
	private int cantPreguntasUsabilidad = 4;
	JLabel lblCalificacion;
	JLabel lblCalificacionDetalle;

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
		fr.setTitle("Resultado Final");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 450, 273);
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
		lblCriterioDeAceptacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblCriterioDeAceptacion.setBounds(73, 0, 260, 25);
		panel.add(lblCriterioDeAceptacion);
		lblCriterioDeAceptacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 41, 414, 162);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEvaluaciónFinal = new JLabel("Evaluaci\u00F3n Final:");
		lblEvaluaciónFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEvaluaciónFinal.setBounds(10, 11, 150, 25);
		panel_1.add(lblEvaluaciónFinal);
		
		JLabel lblResultado = new JLabel("lblResultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResultado.setBounds(160, 47, 77, 14);
		panel_1.add(lblResultado);
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		lblResultado.setText(df.format(frameInicial.getAcumulado()/(double)cantPreguntas));

		lblCalificacion = new JLabel("lblCalificacion");
		lblCalificacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCalificacion.setForeground(Color.BLACK);
		lblCalificacion.setBounds(152, 16, 110, 14);
		panel_1.add(lblCalificacion);
		lblCalificacion.setText("Calificaci\u00F3n");
		
		lblCalificacionDetalle = new JLabel("lblCalificacionDetalle");
		lblCalificacionDetalle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCalificacionDetalle.setBounds(10, 76, 356, 14);
		panel_1.add(lblCalificacionDetalle);
		lblCalificacionDetalle.setText("Detalle");
		
		JLabel lblPuntajePromedio = new JLabel("Puntaje Promedio:");
		lblPuntajePromedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPuntajePromedio.setBounds(10, 41, 150, 25);
		panel_1.add(lblPuntajePromedio);
		
		JLabel lblFuncionalidad = new JLabel("FUNCIONALIDAD");
		lblFuncionalidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFuncionalidad.setBounds(10, 101, 135, 14);
		panel_1.add(lblFuncionalidad);
		CambiarColorLabel(lblFuncionalidad, frameInicial.getAcumFuncionalidad(), cantPreguntasFuncionalidad);
		
		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEficiencia.setBounds(10, 119, 135, 14);
		panel_1.add(lblEficiencia);
		CambiarColorLabel(lblEficiencia, frameInicial.getAcumEficiencia(), cantPreguntasEficiencia);
		
		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFiabilidad.setBounds(10, 138, 135, 14);
		panel_1.add(lblFiabilidad);
		CambiarColorLabel(lblFiabilidad, frameInicial.getAcumFiabilidad(), cantPreguntasFiabilidad);
		
		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMantenibilidad.setBounds(231, 101, 135, 14);
		panel_1.add(lblMantenibilidad);
		CambiarColorLabel(lblMantenibilidad, frameInicial.getAcumMantenibilidad(), cantPreguntasMantenibilidad);
		
		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsabilidad.setBounds(231, 119, 135, 14);
		panel_1.add(lblUsabilidad);
		CambiarColorLabel(lblUsabilidad, frameInicial.getAcumUsabilidad(), cantPreguntasUsabilidad);
		
		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPortabilidad.setBounds(231, 138, 135, 14);
		panel_1.add(lblPortabilidad);
		CambiarColorLabel(lblPortabilidad, frameInicial.getAcumPortabilidad(), cantPreguntasPortabilidad);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(335, 208, 89, 23);
		contentPane.add(btnNewButton);
		ObtenerCalificacion(frameInicial.getAcumulado()/(double)cantPreguntas);
		fr.setVisible(true);
	}
	
	private String ObtenerCalificacion(double resultado)
	{
		String calificacion = "";
		
		if(resultado > 7)
		{
			lblCalificacion.setText("ACEPTADO");
			lblCalificacion.setForeground(Color.GREEN);
			lblCalificacionDetalle.setText("El producto ha sido aprobado.");
		}
		else if(resultado <= 7 && resultado >= 4)
		{
			lblCalificacion.setText("REGULAR");
			lblCalificacion.setForeground(Color.YELLOW);
			lblCalificacionDetalle.setText("El producto es correcto pero no alcanza para estar aprobado.");
		}
		else
		{
			lblCalificacion.setText("RECHAZADO");
			lblCalificacion.setForeground(Color.RED);
			lblCalificacionDetalle.setText("El producto ha sido rechazado.");
		}
		
		return calificacion;
	}
	
	private void CambiarColorLabel(JLabel label, int total, int cantPreguntas)
	{
		double resultado = total / (double)cantPreguntas;
		
		if(resultado > 7)
		{
			label.setForeground(Color.GREEN);
		}
		else if(resultado <= 7 && resultado >= 4)
		{
			label.setForeground(Color.YELLOW);
		}
		else
		{
			label.setForeground(Color.RED);
		}
	}
}
