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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class PatientMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientMenu frame = new PatientMenu();
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
	public PatientMenu() {
		final JFrame patientMenu=this;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0645\u0646\u0648\u06CC \u0628\u06CC\u0645\u0627\u0631");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u0648 \u0627\u0646\u062A\u062E\u0627\u0628 \u067E\u0632\u0634\u06A9\u0627\u0646");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DoctorsList dl=new DoctorsList(patientMenu);
				dl.setVisible(true);
				patientMenu.setEnabled(false);
			}
		});
		btnNewButton.setBounds(104, 36, 229, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u0633\u0627\u0628\u0642\u0647 \u067E\u0632\u0634\u06A9\u06CC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedicalBackground mb=new MedicalBackground(patientMenu);
				mb.setVisible(true);
				patientMenu.setEnabled(false);
			}
		});
		btnNewButton_1.setBounds(104, 70, 229, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0645\u0634\u0627\u0648\u0631\u0647 \u0628\u0627 \u067E\u0632\u0634\u06A9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AskQuestion aq=new AskQuestion(patientMenu);
				aq.setVisible(true);
				patientMenu.setEnabled(false);
			}
		});
		btnNewButton_2.setBounds(104, 104, 229, 23);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0641\u0639\u0627\u0644\u06CC\u062A \u0628\u062F\u0646\u06CC \u0628\u0627 \u0627\u062A\u0635\u0627\u0644 \u0628\u0647 \u0627\u0628\u0632\u0627\u0631");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterBodyStatus rbs=new RegisterBodyStatus(patientMenu);
				rbs.setVisible(true);
				patientMenu.setEnabled(false);
			}
		});
		button.setBounds(104, 138, 229, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u062E\u0631\u0648\u062C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				patientMenu.dispatchEvent(new WindowEvent(patientMenu, WindowEvent.WINDOW_CLOSING));
			}
		});
		button_1.setBounds(179, 175, 89, 23);
		contentPane.add(button_1);
	}

}
