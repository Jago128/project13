package windows;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Window6 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnChange;
	private JLabel lblAnon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window6 frame = new Window6();
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
	public Window6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblAnon = new JLabel("Anonimo");
		lblAnon.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnon.setBounds(37, 55, 358, 54);
		contentPane.add(lblAnon);

		btnChange = new JButton("Nombre");
		btnChange.setBounds(174, 124, 89, 23);
		contentPane.add(btnChange);
		btnChange.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnChange) {
			String name=(String)JOptionPane.showInputDialog(contentPane, "Introduzca su Nombre:", "Cuadro de Diálogo de Introducción de Datos", JOptionPane.QUESTION_MESSAGE, null, null, "Sin Nombre");
			if (name!=null) {
				lblAnon.setText("Hola "+name);
			} else {
				lblAnon.setText("Error, no se ha introducido un valor valido");
			}
		}
	}
}
