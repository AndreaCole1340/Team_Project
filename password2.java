import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class password2 {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					password2 window = new password2();
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
	public password2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.GREEN);
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(291, 129, 106, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(199, 131, 82, 17);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(291, 74, 106, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username \r\n");
		lblNewLabel.setBounds(168, 74, 106, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(255, 193, 87, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/Users-icon2.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(images));
		lblNewLabel_1.setBounds(20, 21, 164, 195);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
