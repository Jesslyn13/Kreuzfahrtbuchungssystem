package guiFenstern;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

import java.util.Date;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.beans.PropertyChangeListener;

import java.beans.PropertyChangeEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	GUI2 frame2;
	int valueofPerson;
	static JDateChooser dateVon;
	static JDateChooser dateBis;
	static JComboBox comboBox;

	/**
	  * Launch the application.
	  */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public  GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		JLabel lblLogo = new JLabel("Titanic 2");
		lblLogo.setIcon(new ImageIcon(GUI.class.getResource("/bilder/titatnic_2_logo.png")));
		lblLogo.setFont(new Font("X-Files", Font.PLAIN, 14));
		lblLogo.setBounds(0, 10, 1210, 370);
		contentPane.add(lblLogo);

		JLabel lblNewLabel = new JLabel("Personenanzahl:");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(103, 406, 172, 34);
		contentPane.add(lblNewLabel);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox.setSelectedIndex(0);
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(103, 436, 153, 26);
		contentPane.add(comboBox);

		JLabel lblVon = new JLabel("Von");
		lblVon.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVon.setBackground(Color.GRAY);
		lblVon.setBounds(496, 406, 172, 34);
		contentPane.add(lblVon);

		JLabel lblBis = new JLabel("Bis");
		lblBis.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBis.setBackground(Color.GRAY);
		lblBis.setBounds(857, 406, 172, 34);
		contentPane.add(lblBis);

		Date startDate = new Date();
		dateVon = new JDateChooser();
		dateVon.setBounds(495, 436, 135, 26);
		dateVon.setMinSelectableDate(startDate);
		contentPane.add(dateVon);

		dateBis = new JDateChooser();
		dateBis.setBounds(857, 436, 135, 26);
		contentPane.add(dateBis);

		dateVon.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				dateBis.setMinSelectableDate(dateVon.getDate());
			}
		});

		JButton btnNext = new JButton("Weiter");

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frame2 = new GUI2();
				frame2.setVisible(true);
				valueofPerson = Integer.valueOf((String) comboBox.getSelectedItem());
				if (valueofPerson == 2) {
					GUI2.btnZimmer1.setVisible(false);
					frame2.lblZimmer1.setIcon(frame2.cGray);
				}else if (valueofPerson == 3) {
					GUI2.btnZimmer1.setVisible(false);
					GUI2.btnZimmer2.setVisible(false);
					frame2.lblZimmer1.setIcon(frame2.cGray);
					frame2.lblZimmer2.setIcon(frame2.c2Gray);
				}else if (valueofPerson == 4) {
					GUI2.btnZimmer1.setVisible(false);
					GUI2.btnZimmer2.setVisible(false);
					GUI2.btnZimmer3.setVisible(false);
					frame2.lblZimmer1.setIcon(frame2.cGray);
					frame2.lblZimmer2.setIcon(frame2.c2Gray);
					frame2.lblZimmer3.setIcon(frame2.c3Gray);
				}	else if (valueofPerson > 4) {
					GUI2.btnZimmer1.setVisible(false);
					GUI2.btnZimmer2.setVisible(false);
					GUI2.btnZimmer3.setVisible(false);
					GUI2.btnZimmer4.setVisible(false);
					frame2.lblZimmer1.setIcon(frame2.cGray);
					frame2.lblZimmer2.setIcon(frame2.c2Gray);
					frame2.lblZimmer3.setIcon(frame2.c3Gray);
					frame2.lblZimmer4.setIcon(frame2.c4Gray);
				}

			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext.setBounds(1075, 716, 123, 34);
		contentPane.add(btnNext);

	}
}
