//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JButton;
//import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4930672211406930653L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view1 frame = new view1();
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
	public view1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabourCosting = new JLabel("\t\tLabour Costing Services");
		lblLabourCosting.setFont(new Font("Serif", Font.BOLD, 35));
		lblLabourCosting.setForeground(Color.blue);
		Image images = new ImageIcon(this.getClass().getResource("/option_one.png")).getImage();
		lblLabourCosting.setIcon(new ImageIcon(images));
		lblLabourCosting.setBounds(10, 11, 510, 106);
		contentPane.add(lblLabourCosting);
		
		JButton btnNewButton = new JButton("View Projects\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 25));
		btnNewButton.setForeground(Color.blue);
		Image imagess = new ImageIcon(this.getClass().getResource("/list.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(imagess));
		
		btnNewButton.setBounds(29, 325, 277, 106);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Projects ");
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 25));
		btnNewButton_1.setForeground(Color.blue);
		Image image = new ImageIcon(this.getClass().getResource("/add2.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(image));
		btnNewButton_1.setBounds(29, 188, 277, 106);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
		
		JButton btnAddNewCustomer = new JButton("Add New Customer");
		btnAddNewCustomer.setFont(new Font("Serif", Font.BOLD, 20));
		btnAddNewCustomer.setForeground(Color.blue);
		Image img= new ImageIcon(this.getClass().getResource("/cust.png")).getImage();
		btnAddNewCustomer.setIcon(new ImageIcon(img));
		btnAddNewCustomer.setBounds(347, 188, 308, 106);
		contentPane.add(btnAddNewCustomer);
		
		JButton btnNewButton_2 = new JButton("View Customers\r\n");
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton_2.setForeground(Color.blue);
		Image imag = new ImageIcon(this.getClass().getResource("/list.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(imag));
		btnNewButton_2.setBounds(350, 325, 269, 106);
		contentPane.add(btnNewButton_2);
	}
}
