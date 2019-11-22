import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class Calculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private TitledBorder title;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculo frame = new Calculo();
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
	public Calculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDetallesDelPrestamos = new JLabel("Detalles del prestamo");
		lblDetallesDelPrestamos.setBounds(171, 11, 174, 14);
		contentPane.add(lblDetallesDelPrestamos);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 332, 476, 66);
		title = BorderFactory.createTitledBorder("Sistema de amortización");
		panel.setBorder(title);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnFrances = new JRadioButton("Frances");
		rdbtnFrances.setBounds(6, 24, 109, 23);
		panel.add(rdbtnFrances);
		
		JRadioButton rdbtnAleman = new JRadioButton("Aleman");
		rdbtnAleman.setBounds(155, 24, 109, 23);
		panel.add(rdbtnAleman);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 30, 822, 291);
		contentPane.add(panel_1);
	
		title = BorderFactory.createTitledBorder("Monto y financiamiento");
		panel_1.setBorder(title);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USD.");
		lblNewLabel.setBounds(10, 31, 46, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(51, 28, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(174, 31, 52, 14);
		panel_1.add(lblTiempo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 28, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUstedEstaEn = new JLabel("Usted esta en el rango, desde: ");
		lblUstedEstaEn.setBounds(10, 56, 157, 14);
		panel_1.add(lblUstedEstaEn);
		
		JLabel lblR = new JLabel("r1");
		lblR.setBounds(174, 56, 27, 14);
		panel_1.add(lblR);
		
		JLabel label = new JLabel("-");
		label.setBounds(211, 56, 14, 14);
		panel_1.add(label);
		
		JLabel lblHasta = new JLabel("hasta");
		lblHasta.setBounds(230, 56, 37, 14);
		panel_1.add(lblHasta);
		
		JLabel lblR_1 = new JLabel("r2");
		lblR_1.setBounds(277, 56, 27, 14);
		panel_1.add(lblR_1);
		
		JLabel lblMeses = new JLabel("meses");
		lblMeses.setBounds(317, 56, 46, 14);
		panel_1.add(lblMeses);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 81, 802, 82);
		title = BorderFactory.createTitledBorder("Tasas de interes");
		panel_2.setBorder(title);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 188, 802, 82);
		title = BorderFactory.createTitledBorder("Tasas de mora");
		panel_3.setBorder(title);
		panel_1.add(panel_2);
		panel_1.add(panel_3);
	}
}
