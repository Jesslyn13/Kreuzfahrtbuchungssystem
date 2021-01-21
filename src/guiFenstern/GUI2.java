package guiFenstern;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI2 extends JFrame {

	private JPanel contentPane;
	JButton btnZimmer1;
	JButton btnZimmer2;
	JButton btnZimmer3;
	JButton btnZimmer4;
	JLabel lblZimmer1;
	JLabel lblZimmer2;
	JLabel lblZimmer3;
	JLabel lblZimmer4;
	ImageIcon cGray;
	ImageIcon c2Gray;
	ImageIcon c3Gray;
	ImageIcon c4Gray;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
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
	public GUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		JPanel panelStart = new JPanel();
		panelStart.setBounds(0, 0, 1210, 122);
		contentPane.add(panelStart);
		panelStart.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblZimmerauswahl = new JLabel("Zimmerauswahl");
		lblZimmerauswahl.setFont(new Font("Tahoma", Font.BOLD, 37));
		panelStart.add(lblZimmerauswahl);

		JButton btnBack = new JButton("Zur\u00FCck");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI2.this.setVisible(false);
				GUI a = new GUI();
				a.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBack.setBounds(10, 719, 123, 34);
		contentPane.add(btnBack);

		JButton btnNext2 = new JButton("Weiter");
		btnNext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GUI3 a = new GUI3();
				a.setVisible(true);
			}
		});
		btnNext2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNext2.setBounds(1075, 716, 123, 34);
		btnNext2.setEnabled(false);
		contentPane.add(btnNext2);

		JCheckBox chckbxFenster = new JCheckBox("Fenster");
		chckbxFenster.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxFenster.setBounds(30, 605, 95, 34);
		chckbxFenster.setEnabled(false);
		contentPane.add(chckbxFenster);

		lblZimmer1 = new JLabel("New label");
		lblZimmer1.setBounds(30, 171, 251, 209);
		contentPane.add(lblZimmer1);

		lblZimmer2 = new JLabel("New label");
		lblZimmer2.setBounds(291, 171, 251, 209);
		contentPane.add(lblZimmer2);

		lblZimmer3 = new JLabel("New label");
		lblZimmer3.setBounds(30, 390, 251, 209);
		contentPane.add(lblZimmer3);

		lblZimmer4 = new JLabel("New label");
		lblZimmer4.setBounds(291, 390, 251, 209);
		contentPane.add(lblZimmer4);

		JLabel lblSuite = new JLabel("New label");
		lblSuite.setBounds(628, 261, 508, 257);
		contentPane.add(lblSuite);

		// Bild Zimmer1
		ImageIcon a = new ImageIcon(GUI2.class.getResource("/bilder/Zimmer1.jpg"));
		Image b = a.getImage();
		Image newimg = b.getScaledInstance(lblZimmer1.getWidth(), lblZimmer1.getHeight(), Image.SCALE_SMOOTH);
		Image grayImage = GrayFilter.createDisabledImage(newimg);
		ImageIcon c = new ImageIcon(newimg);
		cGray = new ImageIcon(grayImage);
		lblZimmer1.setIcon(c);

		// Bild Zimmer2
		ImageIcon a2 = new ImageIcon(GUI2.class.getResource("/bilder/Zimmer2.png"));
		Image b2 = a2.getImage();
		Image newimg2 = b2.getScaledInstance(lblZimmer2.getWidth(), lblZimmer2.getHeight(), Image.SCALE_SMOOTH);
		Image grayImage2 = GrayFilter.createDisabledImage(newimg2);
		ImageIcon c2 = new ImageIcon(newimg2);
		c2Gray = new ImageIcon(grayImage2);
		lblZimmer2.setIcon(c2);

		// Bild Zimmer3
		ImageIcon a3 = new ImageIcon(GUI2.class.getResource("/bilder/Zimmer3.jpg"));
		Image b3 = a3.getImage();
		Image newimg3 = b3.getScaledInstance(lblZimmer3.getWidth(), lblZimmer3.getHeight(), Image.SCALE_SMOOTH);
		Image grayImage3 = GrayFilter.createDisabledImage(newimg3);
		ImageIcon c3 = new ImageIcon(newimg3);
		c3Gray = new ImageIcon(grayImage3);
		lblZimmer3.setIcon(c3);

		// Bild Zimmer4
		ImageIcon a4 = new ImageIcon(GUI2.class.getResource("/bilder/Zimmer4.png"));
		Image b4 = a4.getImage();
		Image newimg4 = b4.getScaledInstance(lblZimmer4.getWidth(), lblZimmer4.getHeight(), Image.SCALE_SMOOTH);
		Image grayImage4 = GrayFilter.createDisabledImage(newimg4);
		ImageIcon c4 = new ImageIcon(newimg4);
		c4Gray = new ImageIcon(grayImage4);
		lblZimmer4.setIcon(c4);

		// Bild Suite
		ImageIcon a5 = new ImageIcon(GUI2.class.getResource("/bilder/suite.jpg"));
		Image b5 = a5.getImage();
		Image newimg5 = b5.getScaledInstance(lblSuite.getWidth(), lblSuite.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon c5 = new ImageIcon(newimg5);
		lblSuite.setIcon(c5);

		JLabel lblNewLabel = new JLabel("Pr\u00E4sidenten Suite");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(821, 226, 139, 25);
		contentPane.add(lblNewLabel);

		btnZimmer1 = new JButton("New button");
		btnZimmer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxFenster.setEnabled(true);
				btnNext2.setEnabled(true);
			}
		});
		btnZimmer1.setBounds(30, 169, 251, 211);
		btnZimmer1.setOpaque(false);
		btnZimmer1.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(btnZimmer1);

		btnZimmer2 = new JButton("New button");
		btnZimmer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxFenster.setEnabled(true);
				btnNext2.setEnabled(true);
			}
		});
		btnZimmer2.setBounds(291, 171, 251, 209);
		btnZimmer2.setOpaque(false);
		btnZimmer2.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(btnZimmer2);

		btnZimmer3 = new JButton("New button");
		btnZimmer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxFenster.setEnabled(true);
				btnNext2.setEnabled(true);
			}
		});
		btnZimmer3.setBounds(30, 390, 251, 209);
		btnZimmer3.setOpaque(false);
		btnZimmer3.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(btnZimmer3);

		btnZimmer4 = new JButton("New button");
		btnZimmer4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxFenster.setEnabled(true);
				btnNext2.setEnabled(true);
			}
		});
		btnZimmer4.setBounds(290, 389, 252, 210);
		btnZimmer4.setOpaque(false);
		btnZimmer4.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(btnZimmer4);

		JButton btnSuite = new JButton("New button");
		btnSuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNext2.setEnabled(true);
			}
		});
		btnSuite.setBounds(631, 265, 505, 253);
		btnSuite.setOpaque(false);
		btnSuite.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(btnSuite);

	}
}
