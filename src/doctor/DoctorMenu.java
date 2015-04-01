package doctor;

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

public class DoctorMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorMenu frame = new DoctorMenu();
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
	public DoctorMenu() {
		final DoctorMenu doctorMenu=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0645\u0646\u0648\u06CC \u067E\u0632\u0634\u06A9");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\u0645\u062F\u06CC\u0631\u06CC\u062A \u062F\u0631\u062E\u0648\u0627\u0633\u062A \u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagePatientRequests mpr=new ManagePatientRequests(doctorMenu);
				mpr.setVisible(true);
				doctorMenu.setEnabled(false);
			}
		});
		btnNewButton.setBounds(108, 52, 224, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u062C\u0633\u062A\u062C\u0648\u06CC \u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchPatient sp=new SearchPatient(doctorMenu);
				sp.setVisible(true);
				doctorMenu.setEnabled(false);
			}
		});
		btnNewButton_1.setBounds(108, 86, 224, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u062B\u0628\u062A \u0648\u0636\u0639\u06CC\u062A \u062C\u0633\u0645\u0627\u0646\u06CC \u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPatientStatus rps=new RegisterPatientStatus(doctorMenu);
				rps.setVisible(true);
				doctorMenu.setEnabled(false);
			}
		});
		btnNewButton_2.setBounds(108, 120, 224, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u062B\u0628\u062A \u0633\u0627\u0628\u0642\u0647 \u0628\u06CC\u0645\u0627\u0631\u06CC \u0628\u06CC\u0645\u0627\u0631");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterIllnessBackground rib=new RegisterIllnessBackground(doctorMenu);
				rib.setVisible(true);
				doctorMenu.setEnabled(false);
			}
		});
		btnNewButton_3.setBounds(108, 154, 224, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u0644\u06CC\u0633\u062A \u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientsList pl=new PatientsList(doctorMenu);
				pl.setVisible(true);
				doctorMenu.setEnabled(false);
			}
		});
		btnNewButton_4.setBounds(108, 188, 224, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u062E\u0631\u0648\u062C");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doctorMenu.dispatchEvent(new WindowEvent(doctorMenu, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnNewButton_5.setBounds(175, 267, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton button = new JButton("\u0633\u0648\u0627\u0644\u0627\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorInbox di=new DoctorInbox(doctorMenu);
				di.setVisible(true);
				doctorMenu.setEnabled(false);
			}
		});
		button.setBounds(108, 222, 224, 23);
		contentPane.add(button);
	}

}
