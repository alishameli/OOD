package salamat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Base extends JFrame {

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
					Base frame = new Base();
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
	public Base() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JFrame base=this;
		
		JButton btnNewButton = new JButton("\u0648\u0631\u0648\u062F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(284, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u062B\u0628\u062A \u0646\u0627\u0645");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base.setEnabled(false);
				SignUp signUp=new SignUp(base);
				signUp.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(185, 228, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u062A\u063A\u06CC\u06CC\u0631 \u0631\u0645\u0632");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base.setEnabled(false);
				ChangePassword changePass=new ChangePassword(base);
				changePass.setVisible(true);
				
				//base.setVisible(false);
				//while(changePass.isEnabled());
				//base.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(86, 228, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("\u0633\u0627\u0645\u0627\u0646\u0647 \u0633\u0644\u0627\u0645\u062A");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(160, 11, 129, 38);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(106, 60, 211, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 91, 211, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		label_1.setBounds(327, 63, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631");
		label_2.setBounds(327, 94, 46, 14);
		contentPane.add(label_2);
	}
}
