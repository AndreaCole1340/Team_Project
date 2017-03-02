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

@SuppressWarnings("serial")
public class addResource extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=148,349
	 */
	private final JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");

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
		internalFrame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResourceType = new JLabel("Resource Type");
		lblResourceType.setFont(new Font("Serif", Font.BOLD, 15));
		lblResourceType.setForeground(Color.BLACK);
		lblResourceType.setBounds(22, 97, 138, 25);
		contentPane.add(lblResourceType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 101, 88, 20);
		contentPane.add(comboBox);
		
		JLabel lblAddNewResource = new JLabel("Add New Resource Details");
		lblAddNewResource.setFont(new Font("Serif", Font.BOLD, 25));
		lblAddNewResource.setForeground(Color.blue);
		lblAddNewResource.setBounds(20, 11, 345, 36);
		contentPane.add(lblAddNewResource);
		
		JLabel lblResourcePrice = new JLabel("Resource Price");
		lblResourcePrice.setFont(new Font("Serif", Font.BOLD, 15));
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
	}
}
