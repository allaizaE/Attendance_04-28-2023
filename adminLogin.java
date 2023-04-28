import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class adminLogin {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin window = new adminLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1078, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\loginButton.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(457, 561, 113, 48);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\adminIcon.png"));
		lblNewLabel.setBounds(399, 129, 231, 181);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(143, 188, 143));
		textField_1.setBounds(257, 349, 511, 56);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\username.png"));
		lblNewLabel_1.setBounds(257, 314, 511, 98);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(143, 188, 143));
		textField.setBounds(257, 461, 511, 56);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\password.png"));
		lblNewLabel_2.setBounds(257, 422, 511, 109);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\bgLogin.png"));
		lblNewLabel_3.setBounds(141, 102, 763, 544);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\Rectangle 5.png"));
		lblNewLabel_4.setBounds(0, 0, 1064, 750);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
