package windowProjects;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class WindowProject4 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textFieldApe;
	private JRadioButton rdbtnProfesor;
	private JRadioButton rdbtnAlumno;
	private JCheckBox chckbxCastellano;
	private JCheckBox chckbxEuskera;
	private JCheckBox chckbxIngles;
	private JButton btnSend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowProject4 frame = new WindowProject4();
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
	public WindowProject4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNom = new JLabel("Nombre");
		lblNom.setBounds(57, 73, 46, 14);
		contentPane.add(lblNom);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(57, 102, 46, 14);
		contentPane.add(lblApellido);

		rdbtnProfesor = new JRadioButton("Profesor");
		rdbtnProfesor.setBounds(298, 68, 75, 33);
		contentPane.add(rdbtnProfesor);

		rdbtnAlumno = new JRadioButton("Alumno");
		rdbtnAlumno.setBounds(298, 97, 75, 33);
		contentPane.add(rdbtnAlumno);

		JLabel lblLangs = new JLabel("Idiomas que conoces (por lo menos un nivel B2)");
		lblLangs.setHorizontalAlignment(SwingConstants.CENTER);
		lblLangs.setBounds(39, 137, 355, 33);
		contentPane.add(lblLangs);

		chckbxCastellano = new JCheckBox("Castellano");
		chckbxCastellano.setBounds(65, 177, 89, 33);
		contentPane.add(chckbxCastellano);

		chckbxEuskera = new JCheckBox("Euskera");
		chckbxEuskera.setBounds(156, 177, 89, 33);
		contentPane.add(chckbxEuskera);

		chckbxIngles = new JCheckBox("Ingles");
		chckbxIngles.setBounds(261, 177, 75, 33);
		contentPane.add(chckbxIngles);

		btnSend = new JButton("Enviar");
		btnSend.setBounds(156, 227, 89, 23);
		contentPane.add(btnSend);

		textFieldNom = new JTextField();
		textFieldNom.setBounds(113, 72, 86, 20);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);

		textFieldApe = new JTextField();
		textFieldApe.setColumns(10);
		textFieldApe.setBounds(113, 99, 86, 20);
		contentPane.add(textFieldApe);

		JLabel lblTitle = new JLabel("CIFP ZORNOTZA LHII");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(27, 11, 385, 33);
		contentPane.add(lblTitle);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String choice="";
		String lang1="";
		String lang2="";
		String lang3="";

		if (rdbtnProfesor.isSelected()) {
			choice="Profesor";
		} else if (rdbtnAlumno.isSelected()) {
			choice="Alumno";
		}

		if (chckbxCastellano.isSelected()) {
			lang1="Castellano";
		}

		if (chckbxEuskera.isSelected()) {
			lang1="Euskera";
		}
		if (chckbxIngles.isSelected()) {
			lang1="Ingles";
		}
		
		if (e.getSource()==btnSend) {
			JDialog d=new JDialog();
			d.setTitle("Bienvenido "+choice+" "+textFieldNom.getText()+" "+textFieldApe.getText());
			

		}
	}
}
