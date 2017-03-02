import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class addTaskPane extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addTaskPane frame = new addTaskPane();
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
	public addTaskPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddNewTask = new JLabel("Add New Task Details");
		lblAddNewTask.setFont(new Font("Serif", Font.BOLD, 25));
		lblAddNewTask.setForeground(Color.blue);
		lblAddNewTask.setBounds(57, 11, 270, 42);
		contentPane.add(lblAddNewTask);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.black);
		lblNewLabel.setBounds(24, 88, 46, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.black);
		lblNewLabel_1.setBounds(24, 134, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Serif", Font.BOLD, 15));
		lblDuration.setForeground(Color.black);
		lblDuration.setBounds(24, 183, 77, 25);
		contentPane.add(lblDuration);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setFont(new Font("Serif", Font.BOLD, 15));
		lblRole.setForeground(Color.black);
		lblRole.setBounds(24, 219, 46, 19);
		contentPane.add(lblRole);
		
		textField = new JTextField();
		textField.setBounds(111, 88, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(111, 131, 86, 20);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 187, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(111, 218, 86, 20);
		contentPane.add(comboBox_1);
		
		JLabel label = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/addTask.png")).getImage();
		label.setIcon(new ImageIcon(images));
		label.setBounds(257, 64, 157, 161);
		contentPane.add(label);
		
		JButton btnAddToProject = new JButton("Add to Project");
		btnAddToProject.setBounds(231, 250, 183, 62);
		contentPane.add(btnAddToProject);
	}
}
