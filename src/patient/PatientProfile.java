package patient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import doctor.DrugPrescription;
import doctor.ReferToSpecialist;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientProfile extends JFrame {

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientProfile frame = new PatientProfile();
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
	public PatientProfile() {
		final PatientProfile patientProfile=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u067E\u0631\u0648\u0641\u0627\u06CC\u0644 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645:");
		label_1.setBounds(355, 51, 69, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC:");
		label_2.setBounds(355, 76, 69, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u062A\u0645\u0627\u0633:");
		label_3.setBounds(355, 101, 69, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0622\u062E\u0631\u06CC\u0646 \u0645\u0639\u0627\u06CC\u0646\u0647:");
		label_4.setBounds(355, 126, 89, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u062F\u0627\u0631\u0648\u0647\u0627\u06CC \u062A\u062C\u0648\u06CC\u0632 \u0634\u062F\u0647:");
		label_5.setBounds(355, 151, 102, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u062A\u0648\u0636\u06CC\u062D\u0627\u062A:");
		label_6.setBounds(355, 176, 46, 14);
		contentPane.add(label_6);
		
		JButton button = new JButton("\u0627\u0631\u062C\u0627\u0639 \u0628\u0647 \u0645\u062A\u062E\u0635\u0635");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReferToSpecialist rts=new ReferToSpecialist(patientProfile);
				rts.setVisible(true);
				patientProfile.setEnabled(false);
			}
		});
		button.setBounds(248, 228, 111, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u062A\u062C\u0648\u06CC\u0632 \u062F\u0627\u0631\u0648");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrugPrescription dp=new DrugPrescription(patientProfile);
				dp.setVisible(true);
				patientProfile.setEnabled(false);
			}
		});
		btnNewButton.setBounds(127, 228, 111, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(56, 48, 289, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(56, 73, 289, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(56, 98, 289, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(56, 123, 289, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(56, 148, 289, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(56, 173, 289, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}

}
