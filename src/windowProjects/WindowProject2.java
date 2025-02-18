package windowProjects;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class WindowProject2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowProject2 frame = new WindowProject2();
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
	public WindowProject2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Quieres contestar?");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 13));
		lblNewLabel.setBounds(89, 28, 155, 28);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("SI");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(34, 74, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("NO");
		btnNewButton_1.setBounds(163, 74, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		JButton btnNewButton_2 = new JButton("Quizas");
		btnNewButton_2.setBounds(293, 74, 89, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 174, 403, 76);
		contentPane.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			lblNewLabel_1.setText("Si voy a contestar");
		} else if (e.getSource()==btnNewButton_1) {
			lblNewLabel_1.setText("No voy a contestar");
		} else {
			lblNewLabel_1.setText("Quizas, quizas, quizas");
		}
	}

}
