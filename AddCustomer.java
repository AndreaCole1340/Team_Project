
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
//import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class AddCustomer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer();
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
	public AddCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 267);
		getContentPane().setLayout(null);
		
		JLabel lblEnterNewCustomer = new JLabel("Enter new customer details");
		lblEnterNewCustomer.setFont(new Font("Serif", Font.BOLD, 20));
		lblEnterNewCustomer.setForeground(Color.blue);
		lblEnterNewCustomer.setBounds(30, 11, 332, 27);
		getContentPane().add(lblEnterNewCustomer);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblName.setForeground(Color.BLACK);

		lblName.setBounds(30, 41, 61, 32);
		getContentPane().add(lblName);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblType.setForeground(Color.BLACK);
		lblType.setBounds(30, 81, 46, 17);
		getContentPane().add(lblType);
		
		textField = new JTextField();
		textField.setBounds(140, 49, 148, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setBounds(30, 125, 74, 17);
		getContentPane().add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 125, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblContactNo.setForeground(Color.BLACK);
		lblContactNo.setBounds(30, 178, 89, 20);
		getContentPane().add(lblContactNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 178, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		ButtonGroup btg = new ButtonGroup();
		JRadioButton rdbtnProfessional = new JRadioButton("Professional");
		rdbtnProfessional.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		rdbtnProfessional.setBounds(98, 80, 116, 23);
		getContentPane().add(rdbtnProfessional);
		
		JRadioButton rdbtnDomestic = new JRadioButton("Personal");
		rdbtnDomestic.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		rdbtnDomestic.setBounds(233, 78, 109, 23);
		getContentPane().add(rdbtnDomestic);
		
		
		JLabel lblL = new JLabel("l");
		Image image = new ImageIcon(this.getClass().getResource("/user2.png")).getImage();
		lblL.setIcon(new ImageIcon(image));
		lblL.setBounds(271, 68, 136, 173);
		getContentPane().add(lblL);
		
		
		
		contentPane = new JPanel();
		JLabel lblAddCustomer = new JLabel("\t\tEnter New Customer details");
		lblAddCustomer.setFont(new Font("Serif", Font.BOLD, 25));
		//add labels for name type address and contact
		//add fields to input name address and contact number
		//add jComboBox for type.
		btg.add(rdbtnDomestic);
		btg.add(rdbtnProfessional);
	}
}
