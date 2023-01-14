package Hostel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class AdminHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1072, 605);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(73, 89, 931, 442);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		 //Hostel Applicants data button - Click to direct to the applicants list.
		JButton btnNameList = new JButton("Name List");
		btnNameList.setForeground(new Color(0, 0, 0));
		btnNameList.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNameList.setBounds(148, 165, 235, 108);
		panel.add(btnNameList);
		btnNameList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NameList as = new NameList();
				dispose();
				as.setVisible(true);
			}

		});
		
		 //Logout button - Click to exit the program.
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(new Color(0, 0, 0));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnLogout.setBounds(556, 165, 224, 108);
		panel.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("Admin Menu");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(437, 39, 202, 39);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
	}
}
