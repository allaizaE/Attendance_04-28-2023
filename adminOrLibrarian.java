import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class adminOrLibrarian {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminOrLibrarian window = new adminOrLibrarian();
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
	public adminOrLibrarian() {
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
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\adminButton.png"));
		btnNewButton.setBounds(188, 261, 292, 289);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\librarianButton.png"));
		btnNewButton_1.setBounds(558, 261, 292, 289);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\Frame 5.png"));
		lblNewLabel.setBounds(97, 29, 887, 91);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\longRectangle.png"));
		lblNewLabel_1.setBounds(0, 0, 1064, 150);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\Rectangle 5.png"));
		lblNewLabel_2.setBounds(0, 0, 1064, 702);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
