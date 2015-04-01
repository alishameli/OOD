package salamat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp(final JFrame parent) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u0646\u0627\u0645");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u0646\u0627\u0645 \u0648 \u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC:");
		lblNewLabel.setBounds(378, 36, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC:");
		lblNewLabel_1.setBounds(378, 61, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u062A\u0645\u0627\u0633:");
		label_1.setBounds(378, 86, 68, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0622\u062F\u0631\u0633:");
		label_2.setBounds(378, 111, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u062A\u0648\u0636\u06CC\u062D\u0627\u062A:");
		label_3.setBounds(378, 167, 46, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(161, 33, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 58, 207, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 83, 207, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(39, 108, 329, 50);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(39, 164, 329, 50);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_4 = new JLabel("\u0646\u0648\u0639:");
		label_4.setBounds(378, 224, 46, 14);
		contentPane.add(label_4);
		
		JRadioButton radioButton = new JRadioButton("\u0628\u06CC\u0645\u0627\u0631");
		radioButton.setBounds(259, 221, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u067E\u0632\u0634\u06A9");
		radioButton_1.setBounds(148, 220, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u062F\u0627\u0631\u0648\u062E\u0627\u0646\u0647");
		radioButton_2.setBounds(37, 221, 109, 23);
		contentPane.add(radioButton_2);
		
		JLabel label_5 = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC:");
		label_5.setBounds(378, 249, 83, 14);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 246, 207, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_6 = new JLabel("\u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631:");
		label_6.setBounds(378, 274, 83, 14);
		contentPane.add(label_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 271, 207, 20);
		contentPane.add(passwordField);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0646\u0627\u0645");
		button.setBounds(183, 323, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}
	
}
