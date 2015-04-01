package pharmacy;

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

public class PharmacyMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PharmacyMenu frame = new PharmacyMenu();
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
	public PharmacyMenu() {
		final PharmacyMenu pharmacyMenu=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0645\u0646\u0648\u06CC \u062F\u0627\u0631\u0648\u062E\u0627\u0646\u0647");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u0646\u0633\u062E\u0647\u200C\u0647\u0627");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrescriptionList pl=new PrescriptionList(pharmacyMenu);
				pl.setVisible(true);
				pharmacyMenu.setEnabled(false);
			}
		});
		btnNewButton.setBounds(129, 53, 173, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u062B\u0628\u062A \u062A\u062D\u0648\u06CC\u0644 \u062F\u0627\u0631\u0648");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterMedicineDelivery rmd=new RegisterMedicineDelivery(pharmacyMenu);
				rmd.setVisible(true);
				pharmacyMenu.setEnabled(false);
			}
		});
		btnNewButton_1.setBounds(129, 87, 173, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("\u062E\u0631\u0648\u062C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmacyMenu.dispatchEvent(new WindowEvent(pharmacyMenu, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(174, 121, 89, 23);
		contentPane.add(button);
	}

}
