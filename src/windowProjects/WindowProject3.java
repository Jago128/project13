package windowProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowProject3 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowProject3 frame = new WindowProject3();
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
	public WindowProject3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ltrabado\\Desktop\\descarga.jfif"));
		setTitle("Mi quinta Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplicación de DAMi");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Source Serif Pro Light", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(120, 25, 190, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setBounds(71, 108, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(71, 133, 96, 17);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(188, 105, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 130, 86, 20);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("SI");
		btnNewButton.setForeground(new Color(0, 128, 0));
		
		btnNewButton.setBounds(20, 186, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("NO");
		btnNewButton_1.setForeground(new Color(255, 0, 128));
		btnNewButton_1.setBounds(157, 186, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Quizas");
		btnNewButton_2.setForeground(new Color(255, 128, 0));
		btnNewButton_2.setBounds(297, 186, 89, 23);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(48, 220, 338, 30);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			lblNewLabel_3.setText("Bienvenido "+textField.getText());
		} else if (e.getSource()==btnNewButton_1) {
			if (new String(passwordField.getPassword()).equals("1234")) {
				lblNewLabel_3.setText("ok");
			} else {
				lblNewLabel_3.setText("NO ok");
			}
		} else if (e.getSource()==btnNewButton_2) {
			lblNewLabel_3.setText("QUIZAS, QUIZAS, QUIZAS");
		}
		
	}
}