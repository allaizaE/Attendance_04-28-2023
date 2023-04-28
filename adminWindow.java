import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class adminWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminWindow window = new adminWindow();
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
	public adminWindow() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\Frame 5.png"));
		lblNewLabel.setBounds(88, 20, 893, 122);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\longRectangle.png"));
		lblNewLabel_1.setBounds(-51, -27, 1156, 211);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\welcomeText.png"));
		lblNewLabel_2.setBounds(72, 281, 964, 184);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Allaiza\\Downloads\\LIBRARY ATTENDANCE\\Rectangle 5.png"));
		lblNewLabel_3.setBounds(0, -27, 1083, 800);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
