package funciones;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JLabel lblNewLabel_1;
	private JTextField txtUFc;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtUFa;
	private JTextField txtUFb;
	private JButton btnCalcularNota;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNotaMedia;
	private JLabel lblResultado;
	private int ufc;
	private int ufb;
	private int ufa;
	private int notaMedia;
	private Object request;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setTitle("Calcular media MF0227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[101.00][grow][grow]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		contentPane.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 1 0 2 1,growx");
		txtNombre.setColumns(10);
		
		lblNewLabel_1 = new JLabel("UF2404:");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		txtUFa = new JTextField();
		contentPane.add(txtUFa, "cell 1 1,growx");
		txtUFa.setColumns(10);
		
		lblNewLabel_2 = new JLabel("UF2405:");
		contentPane.add(lblNewLabel_2, "flowx,cell 2 1");
		
		txtUFb = new JTextField();
		contentPane.add(txtUFb, "cell 2 1");
		txtUFb.setColumns(10);
		
		lblNewLabel_3 = new JLabel("UF2406:");
		contentPane.add(lblNewLabel_3, "cell 2 1");
		
		txtUFc = new JTextField();
		contentPane.add(txtUFc, "cell 2 1,growx");
		txtUFc.setColumns(10);
		
		btnCalcularNota = new JButton("Calcular Nota");
		btnCalcularNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularNota();
			}
		});
		contentPane.add(btnCalcularNota, "cell 2 3");
		
		lblNewLabel_4 = new JLabel("Nota Media:");
		contentPane.add(lblNewLabel_4, "cell 0 4");
		
		lblNotaMedia = new JLabel("0.0");
		contentPane.add(lblNotaMedia, "cell 1 4");
		
		lblNewLabel_5 = new JLabel("Resultado:");
		contentPane.add(lblNewLabel_5, "cell 0 5");
		
		lblResultado = new JLabel("No calculado aún");
		contentPane.add(lblResultado, "cell 1 5");
	}

	protected void calcularNota() {
		
		String nombre = txtNombre.getText();
		double ufa = Double.parseDouble(request.getValue("txtUFa"));
		double ufb = Double.parseDouble(request.getValue("txtUFb"));
		double ufc = Double.parseDouble(request.getValue("txtUFc"));
		double notaMedia = Double.parseDouble(request.getValue("lblNotaMedia"));
		double Resultado = Double.parseDouble(request.getValue("lblResultado")); 
		
	}
	
	
	
	private void notaMedia() {
		
		notaMedia = (ufa+ufb+ufc)/3;
		
		
		
	}

	private void lblResultado() {
		
		devuelveNota();
		
		
	}

	private void txtUFc() {
		// TODO Esbozo de método generado automáticamente
		
	}

	private void txtUFb() {
		// TODO Esbozo de método generado automáticamente
		
	}

	private void txtUFa() {
		// TODO Esbozo de método generado automáticamente
		
	}

}
