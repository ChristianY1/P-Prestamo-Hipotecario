import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import javafx.scene.layout.Border;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JComboBox JCrazon;
	private JLabel lblNumeroDeAportaciones;
	private TitledBorder title;
	private JPanel panel2;
	private JRadioButton rdbtnAfiliado;
	private JRadioButton rdbtnJubilado;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrestamoHipotecario = new JLabel("Prestamo Hipotecario");
		lblPrestamoHipotecario.setBounds(246, 11, 140, 14);
		contentPane.add(lblPrestamoHipotecario);
		
		JCrazon = new JComboBox();
		JCrazon.setBounds(10, 50, 168, 20);
		JCrazon.addItem("Vivienda terminada");
		JCrazon.addItem("Construccion de vivienda");
		JCrazon.addItem("Remodelacion y ampliacion");
		JCrazon.addItem("Adquisicion de terreno");
		JCrazon.addItem("Sustitucion de hipoteca");
		contentPane.add(JCrazon);
		
		JLabel lblEligaUnaOpcin = new JLabel("Eliga una opcion");
		lblEligaUnaOpcin.setBounds(10, 25, 118, 14);
		contentPane.add(lblEligaUnaOpcin);
		
		lblNumeroDeAportaciones = new JLabel("Su vivienda es: ");
		lblNumeroDeAportaciones.setBounds(10, 103, 124, 14);
		contentPane.add(lblNumeroDeAportaciones);
		
		JRadioButton rdbtnNueva = new JRadioButton("Nueva");
		rdbtnNueva.setBounds(100, 99, 62, 23);
		contentPane.add(rdbtnNueva);
		
		JRadioButton rdbtnAntigua = new JRadioButton("Antigua");
		rdbtnAntigua.setBounds(100, 142, 78, 23);
		contentPane.add(rdbtnAntigua);
		
		JLabel lblcuentaConLos = new JLabel("¿Cuenta con los servicios basicos?");
		lblcuentaConLos.setBounds(202, 103, 207, 14);
		contentPane.add(lblcuentaConLos);
		
		JRadioButton rdbtnSi = new JRadioButton("si");
		rdbtnSi.setBounds(415, 99, 109, 23);
		contentPane.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("no");
		rdbtnNo.setBounds(415, 142, 109, 23);
		contentPane.add(rdbtnNo);
		
		JLabel lblUstedEs = new JLabel("Usted es: ");
		lblUstedEs.setBounds(10, 197, 83, 14);
		contentPane.add(lblUstedEs);
		
		rdbtnAfiliado = new JRadioButton("Afiliado");
		rdbtnAfiliado.setBounds(99, 193, 109, 23);
		rdbtnAfiliado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				rdbtnJubilado.setSelected(false);
				title = BorderFactory.createTitledBorder("Afiliado");
				panel2.setBorder(title);
				
				
				
				
				
			}
		});
		contentPane.add(rdbtnAfiliado);
		
		rdbtnJubilado = new JRadioButton("Jubilado");
		rdbtnJubilado.setBounds(100, 225, 109, 23);
		rdbtnJubilado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				rdbtnAfiliado.setSelected(false);
				title = BorderFactory.createTitledBorder("Jubilado");
				panel2.setBorder(title);
				
			}
		});
		contentPane.add(rdbtnJubilado);
		
		panel2 = new JPanel();
		panel2.setBounds(10, 254, 597, 220);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		
		/*--------------------------------------------------------------*/
		JRadioButton rdbtnDependiente = new JRadioButton("Dependiente");
		rdbtnDependiente.setBounds(20, 24, 109, 23);
		panel2.add(rdbtnDependiente);
		
		JLabel lblNumeroDeAportaciones_1 = new JLabel("Numero de aportaciones: ");
		lblNumeroDeAportaciones_1.setBounds(20, 59, 142, 14);
		panel2.add(lblNumeroDeAportaciones_1);
		
		textField = new JTextField();
		textField.setBounds(161, 56, 31, 20);
		panel2.add(textField);
		textField.setColumns(10);
		
		JLabel lblmantieneAlgunaDeuda = new JLabel("¿Mantiene alguna deuda con el IESS o Biess?");
		lblmantieneAlgunaDeuda.setBounds(20, 150, 247, 14);
		panel2.add(lblmantieneAlgunaDeuda);
		
		JRadioButton rdbtnSi_1 = new JRadioButton("Si");
		rdbtnSi_1.setBounds(20, 171, 51, 23);
		panel2.add(rdbtnSi_1);
		
		JRadioButton rdbtnNo_1 = new JRadioButton("No");
		rdbtnNo_1.setBounds(83, 171, 59, 23);
		panel2.add(rdbtnNo_1);
		
		JRadioButton rdbtnIndependiente = new JRadioButton("Independiente");
		rdbtnIndependiente.setBounds(131, 24, 109, 23);
		panel2.add(rdbtnIndependiente);
		
		JRadioButton rdbtnVoluntario = new JRadioButton("Voluntario");
		rdbtnVoluntario.setBounds(242, 24, 109, 23);
		panel2.add(rdbtnVoluntario);
		
		JLabel lblsuEmpleadorActual = new JLabel("\u00BFSu empleador actual pertenece al Zafra o al seguro social campesino?");
		lblsuEmpleadorActual.setBounds(20, 84, 359, 14);
		panel2.add(lblsuEmpleadorActual);
		
		JRadioButton rdbtnSi_2 = new JRadioButton("Si");
		rdbtnSi_2.setBounds(20, 112, 51, 23);
		panel2.add(rdbtnSi_2);
		
		JRadioButton rdbtnNo_2 = new JRadioButton("No");
		rdbtnNo_2.setBounds(83, 112, 51, 23);
		panel2.add(rdbtnNo_2);
		
		JLabel lblNombres = new JLabel("Nombres: ");
		lblNombres.setBounds(246, 38, 67, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setBounds(246, 78, 67, 14);
		contentPane.add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(323, 36, 124, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(323, 72, 124, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSiguiente = new JButton("siguiente");
		btnSiguiente.setBounds(237, 490, 89, 23);
		contentPane.add(btnSiguiente);
		
		
	}
}
