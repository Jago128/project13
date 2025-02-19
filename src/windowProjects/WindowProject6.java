package windowProjects;

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

public class WindowProject6 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowProject6 frame = new WindowProject6();
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
	public WindowProject6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnon = new JLabel("Anonimo");
		lblAnon.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnon.setBounds(181, 61, 69, 27);
		contentPane.add(lblAnon);
		
		btnChange = new JButton("Nombre");
		btnChange.setBounds(174, 124, 89, 23);
		contentPane.add(btnChange);
		btnChange.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnChange) {
			JOptionPane.showInputDialog(contentPane, "Introduzca su Nombre:", "Cuadro de Diálogo de introducción de datos", JOptionPane.QUESTION_MESSAGE);
		}
	}
}
