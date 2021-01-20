package guiFenstern;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI4 extends JFrame {

	private JPanel contentPane;
	private JTextField tfWeitereFahrt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI4 frame = new GUI4();
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
	public GUI4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 87, 1220, 68);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblDanke = new JLabel("Vielen Dank f\u00FCr ihre Buchung!");
		lblDanke.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDanke.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel.add(lblDanke);

		tfWeitereFahrt = new JTextField();
		tfWeitereFahrt.setBorder(null);
		tfWeitereFahrt.setText("M\u00F6chten Sie noch eine Fahrt buchen ?");
		tfWeitereFahrt.setFont(new Font("Tahoma", Font.BOLD, 31));
		tfWeitereFahrt.setColumns(10);
		tfWeitereFahrt.setBounds(318, 265, 605, 59);
		tfWeitereFahrt.setEditable(false);
		contentPane.add(tfWeitereFahrt);


		// Button für neue Buchungen
		JButton btnYes = new JButton();
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GUI a = new GUI();
				a.setVisible(true);
			}
		});
		btnYes.setBorder(null);
		btnYes.setBackground(Color.LIGHT_GRAY);
		btnYes.setOpaque(false);
		btnYes.setBounds(472, 379, 111, 105);
		btnYes.setOpaque(false);
		ImageIcon a = new ImageIcon(GUI2.class.getResource("/bilder/yes.png"));
		Image b = a.getImage();
		Image newimg = b.getScaledInstance(btnYes.getWidth(), btnYes.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon c = new ImageIcon(newimg);
		btnYes.setIcon(c);
		contentPane.add(btnYes);
		
		
	
		// Button um den Programm zu schließen
		JButton btnNo = new JButton();
		btnNo.setBorder(null);
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNo.setBackground(Color.LIGHT_GRAY);
		btnNo.setOpaque(false);
		btnNo.setBounds(616, 379, 111, 105);
		btnNo.setOpaque(false);
		ImageIcon a2 = new ImageIcon(GUI2.class.getResource("/bilder/no.png"));
		Image b2 = a2.getImage();
		Image newimg2 = b2.getScaledInstance(btnNo.getWidth(), btnNo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon c2 = new ImageIcon(newimg2);
		btnNo.setIcon(c2);
		contentPane.add(btnNo);

	}
}
