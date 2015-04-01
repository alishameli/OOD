package salamat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class ChangePassword extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword frame = new ChangePassword();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ChangePassword(final JFrame parent) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062A\u063A\u06CC\u06CC\u0631 \u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC:");
		label_1.setBounds(323, 36, 101, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631:");
		label_2.setBounds(323, 61, 106, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631 \u062C\u062F\u06CC\u062F:");
		label_3.setBounds(323, 86, 106, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u062A\u06A9\u0631\u0627\u0631 \u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631 \u062C\u062F\u06CC\u062F:");
		label_4.setBounds(323, 111, 106, 14);
		contentPane.add(label_4);
		
		JButton button = new JButton("\u062A\u063A\u06CC\u06CC\u0631 \u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631");
		button.setBounds(162, 144, 106, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(114, 33, 199, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 58, 199, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(114, 83, 199, 20);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(114, 108, 199, 20);
		contentPane.add(passwordField_2);
		
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
