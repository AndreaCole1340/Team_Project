import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addProjectPane extends JFrame {

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
					addProjectPane frame = new addProjectPane();
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
	public addProjectPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewProject = new JLabel("Add New Project Details\r\n\r\n");
		lblNewProject.setLabelFor(this);
		lblNewProject.setFont(new Font("Comic Sans MS", Font.BOLD, 49));
		lblNewProject.setBounds(81, -2, 254, 61);
		contentPane.add(lblNewProject);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setBounds(23, 70, 106, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(139, 72, 98, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("comic sans ms", Font.BOLD, 15));
		

		
		lblName.setBounds(23, 115, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 114, 98, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblStartDate.setBounds(23, 161, 93, 21);
		contentPane.add(lblStartDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 161, 98, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAddTasks = new JButton("Add Tasks");
		lblNewProject.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewProject.setForeground(Color.blue);
		btnAddTasks.setBounds(23, 213, 153, 37);
		contentPane.add(btnAddTasks);
		
		JButton btnReturnTomenu = new JButton("Return to Menu");
		lblNewProject.setFont(new Font("comic sans ms", Font.BOLD, 15));
		lblNewProject.setForeground(Color.blue);
		btnReturnTomenu.setBounds(280, 213, 111, 37);
		contentPane.add(btnReturnTomenu);
		
		JLabel label = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/addTask.png")).getImage();
		label.setIcon(new ImageIcon(images));
		label.setBounds(258, 37, 154, 146);
		contentPane.add(label);
	}

}
