package doctor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class RegisterPatientStatus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPatientStatus frame = new RegisterPatientStatus();
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
	public RegisterPatientStatus(final JFrame parent) {
		final RegisterPatientStatus registerPatientStatus=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 484, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u0648\u0636\u0639\u06CC\u062A \u0628\u06CC\u0645\u0627\u0631");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u0646\u0627\u0645:");
		lblNewLabel.setBounds(378, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC:");
		label_1.setBounds(378, 72, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u062A\u0627\u0631\u06CC\u062E:");
		label_2.setBounds(378, 97, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u062F\u0627\u0631\u0648\u0647\u0627\u06CC \u062A\u062C\u0648\u06CC\u0632\u06CC:");
		label_3.setBounds(378, 122, 80, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0641\u0634\u0627\u0631 \u062E\u0648\u0646:");
		label_4.setBounds(378, 147, 80, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u062A\u0648\u0636\u06CC\u062D\u0627\u062A:");
		label_5.setBounds(378, 172, 46, 14);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(124, 44, 244, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 69, 244, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 94, 244, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(124, 119, 244, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 144, 244, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(32, 169, 336, 46);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton button = new JButton("\u062B\u0628\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerPatientStatus.dispatchEvent(new WindowEvent(registerPatientStatus, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(185, 226, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
