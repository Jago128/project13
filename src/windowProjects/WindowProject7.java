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

public class WindowProject7 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnClick;
	private JLabel lblButtonCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowProject7 frame = new WindowProject7();
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
	public WindowProject7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblButtonCheck = new JLabel("No se ha pulsado un boton");
		lblButtonCheck.setHorizontalAlignment(SwingConstants.CENTER);
		lblButtonCheck.setBounds(63, 48, 299, 54);
		contentPane.add(lblButtonCheck);
		
		btnClick = new JButton("Click aqui");
		btnClick.setBounds(175, 113, 89, 23);
		contentPane.add(btnClick);
		btnClick.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnClick) {
			int option=JOptionPane.showConfirmDialog(btnClick, "Prueba de Cuadros de Diálogo", "Cuadro de Diálogo de Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
			
			switch (option) {
			
			case JOptionPane.YES_OPTION:
				lblButtonCheck.setText("Se ha pulsado la opcion Si.");
				break;
				
			case JOptionPane.NO_OPTION:
				lblButtonCheck.setText("Se ha pulsado la opcion No.");
				break;
				
			case JOptionPane.CANCEL_OPTION:
				lblButtonCheck.setText("Se ha pulsado la opcion Cancelar.");
				break;
				
			case JOptionPane.CLOSED_OPTION:
				lblButtonCheck.setText("Error, no se ha pulsado una opcion valida.");
				break;
			}
		}
	}
}
