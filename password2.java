import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
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
		frame.setBackground(Color.RED);
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(278, 129, 106, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("comic sans ms", Font.BOLD, 15));
		lblPassword.setBounds(186, 129, 82, 17);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(278, 74, 106, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username \r\n");
		lblNewLabel.setFont(new Font("comic sans ms", Font.BOLD, 15));
		lblNewLabel.setBounds(170, 72, 106, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setFont(new Font("comic sans ms", Font.BOLD, 25));
		btnNewButton.setForeground(Color.blue);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/Users-icon2.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(images));
		lblNewLabel_1.setBounds(20, 49, 140, 167);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("comic sans ms", Font.BOLD, 35));
		lblWelcome.setForeground(Color.blue);
		
		lblWelcome.setBounds(146, 11, 187, 37);
		
		frame.getContentPane().add(lblWelcome);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("comic sans ms", Font.BOLD, 25));
		btnLogIn.setForeground(Color.blue);
	
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogIn.setBounds(236, 190, 116, 45);
		frame.getContentPane().add(btnLogIn);
	}
}
