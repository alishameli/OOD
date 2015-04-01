package patient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedicalBackground extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalBackground frame = new MedicalBackground();
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
	public MedicalBackground(final JFrame parent) {
		final JFrame medicalBackground=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0633\u0627\u0628\u0642\u0647 \u067E\u0632\u0634\u06A9\u06CC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(163, 11, 117, 28);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("\u0648\u0636\u0639\u06CC\u062A \u062C\u0633\u0645\u0627\u0646\u06CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhysicalCondition pc=new PhysicalCondition(medicalBackground);
				pc.setVisible(true);
				medicalBackground.setEnabled(false);
			}
		});
		button.setBounds(142, 61, 152, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u0633\u0648\u0627\u0628\u0642 \u0628\u06CC\u0645\u0627\u0631\u06CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IllnessRecord ir=new IllnessRecord(medicalBackground);
				ir.setVisible(true);
				medicalBackground.setEnabled(false);
			}
		});
		btnNewButton.setBounds(142, 95, 152, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0641\u0639\u0627\u0644\u06CC\u062A\u200C\u0647\u0627\u06CC \u0628\u062F\u0646\u06CC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BodyActivities ba=new BodyActivities(medicalBackground);
				ba.setVisible(true);
				medicalBackground.setEnabled(false);
			}
		});
		btnNewButton_1.setBounds(142, 129, 152, 23);
		contentPane.add(btnNewButton_1);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
