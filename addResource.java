//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class addResource extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addResource frame = new addResource();
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
	public addResource() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResourceType = new JLabel("Resource Type");
		lblResourceType.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblResourceType.setForeground(Color.BLACK);
		lblResourceType.setBounds(22, 97, 138, 25);
		contentPane.add(lblResourceType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 101, 88, 20);
		contentPane.add(comboBox);
		
		
		JLabel lblAddNewResource = new JLabel("Add New Resource Details");
		lblAddNewResource.setFont(new Font("comic sans ms", Font.BOLD, 25));
		lblAddNewResource.setForeground(Color.blue);
		lblAddNewResource.setBounds(20, 11, 384, 63);
		contentPane.add(lblAddNewResource);
		//lblLabourCosting.setFont(new Font("comic sans ms", Font.BOLD, 35));
		JLabel lblResourcePrice = new JLabel("Resource Price");
		lblResourcePrice.setFont(new Font("comic sans ms", Font.BOLD, 15));
		lblResourcePrice.setBounds(22, 161, 128, 27);
		contentPane.add(lblResourcePrice);
		
	
		textField = new JTextField();
		textField.setBounds(170, 166, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/document-construction-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(268, 58, 156, 159);
		contentPane.add(lblNewLabel);
		
		JButton btnAddToRole = new JButton("Add to Role");
		btnAddToRole.setFont(new Font("comic sans ms", Font.BOLD, 15));
		btnAddToRole.setBounds(278, 216, 120, 58);
		contentPane.add(btnAddToRole);
		
		JButton btnNewButton = new JButton("Return to Project <");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(24, 216, 193, 58);
		contentPane.add(btnNewButton);
	}
}
