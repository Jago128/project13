package windows;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;


public class PHWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PHWindow frame = new PHWindow();
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
	public PHWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenidos!");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblNewLabel.setBounds(136, 39, 138, 59);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(158, 128, 82, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 187, 424, 74);
		contentPane.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			lblNewLabel_1.setText("Acceso permitido.");
		}
	}
}
