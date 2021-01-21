package guiFenstern;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GUI3 extends JFrame {

	private JPanel contentPane;
	private JTextField tfZimmer;
	private JTextField tfVonDatum;
	private JTextField tfBisDatum;
	private JTextField tfPreis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI3 frame = new GUI3();
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
	public GUI3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 800);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1220, 142);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblUebersicht = new JLabel("\u00DCbersicht");
		lblUebersicht.setFont(new Font("Tahoma", Font.BOLD, 37));
		panel.add(lblUebersicht);

		JLabel lblZimmer = new JLabel("Zimmer:");
		lblZimmer.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblZimmer.setBounds(27, 240, 123, 28);
		contentPane.add(lblZimmer);

		JLabel lblVon = new JLabel("Von:");
		lblVon.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVon.setBounds(27, 278, 123, 28);
		contentPane.add(lblVon);

		JLabel lblBis = new JLabel("Bis:");
		lblBis.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBis.setBounds(27, 316, 123, 28);
		contentPane.add(lblBis);

		JLabel lblPreis = new JLabel("Preis:");
		lblPreis.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPreis.setBounds(27, 396, 123, 28);
		contentPane.add(lblPreis);

		//Button um wieder auf Fenster 2 zu kommen
		JButton btnBack2 = new JButton("Z\u00FCruck");
		btnBack2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack2.setBounds(10, 719, 123, 34);
		JButton btnBack2 = new JButton("Z\u00FCruck");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GUI2 a = new GUI2();
				a.setVisible(true);
			}
		});
		contentPane.add(btnBack2);

		//weiter Button
		JButton btnNext3 = new JButton("Weiter");
		btnNext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GUI4 a = new GUI4();
				a.setVisible(true);
			}
		});
		btnNext3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNext3.setBounds(1075, 716, 123, 34);
		contentPane.add(btnNext3);


		// Textfield Da wird die Kabine gespreichert und angezeigt
		tfZimmer = new JTextField();
		tfZimmer.setBorder(null);
		tfZimmer.setEditable(false);
		tfZimmer.setBounds(119, 240, 152, 28);
		contentPane.add(tfZimmer);
		tfZimmer.setColumns(10);

		// Datum Textfield (Anfang der Fahrt)
		tfVonDatum = new JTextField();
		tfVonDatum.setBorder(null);
		tfVonDatum.setEditable(false);
		tfVonDatum.setColumns(10);
		tfVonDatum.setBounds(119, 278, 152, 28);
		contentPane.add(tfVonDatum);

		// Datum Textfield (Ende der Fahrt)
		tfBisDatum = new JTextField();
		tfBisDatum.setBorder(null);
		tfBisDatum.setEditable(false);
		tfBisDatum.setColumns(10);
		tfBisDatum.setBounds(119, 316, 152, 28);
		contentPane.add(tfBisDatum);

		// Textfield für den Preis
		tfPreis = new JTextField();
		tfPreis.setBorder(null);
		tfPreis.setEditable(false);
		tfPreis.setColumns(10);
		tfPreis.setBounds(119, 396, 152, 28);
		contentPane.add(tfPreis);
	}
}
