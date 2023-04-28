import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class librarianLogin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					librarianLogin window = new librarianLogin();
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
	public librarianLogin() {
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
		btnNewButton.setBounds(475, 547, 112, 53);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\librarianIcon.png"));
		lblNewLabel.setBounds(397, 112, 270, 196);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(143, 188, 143));
		textField.setBounds(253, 345, 511, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(143, 188, 143));
		textField_1.setBounds(253, 459, 511, 56);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\username.png"));
		lblNewLabel_1.setBounds(253, 318, 511, 83);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\password.png"));
		lblNewLabel_2.setBounds(253, 421, 511, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\bgLogin.png"));
		lblNewLabel_3.setBounds(152, 86, 807, 562);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\Rectangle 5.png"));
		lblNewLabel_4.setBounds(0, 0, 1064, 765);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
