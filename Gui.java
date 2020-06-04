import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame {
	private JLabel vysledekLab;
	private JButton sectiBut;
	private JButton odectiBut;
	private JButton vynasobBut;
	private JButton vydelBut;
	private JLabel cis1;
	private JTextField cislo1Field;
	private JLabel cis2;
	private JTextField cislo2Field;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panelVysl;

	public Gui() {
		super("Kalkulaèka");

		FlowLayout layout = new FlowLayout();
		setLayout(layout);

		Color yellow = new Color(222, 157, 0);
		Color hmm = new Color(251, 193, 0);
		Color orange = new Color(255, 102, 0);

		panel1 = new JPanel();
		panel1.setBackground(yellow);
		add(panel1);

		panel2 = new JPanel();
		panel2.setBackground(orange);
		add(panel2);

		panelVysl = new JPanel();
		panelVysl.setBackground(hmm);
		add(panelVysl);

		cis1 = new JLabel("1. èáslo:");
		panel1.add(cis1);

		cislo1Field = new JTextField("", 5);
		panel1.add(cislo1Field);

		cis2 = new JLabel("2. èíslo:");
		panel1.add(cis2);

		cislo2Field = new JTextField("", 5);
		panel1.add(cislo2Field);

		sectiBut = new JButton("+");
		panel2.add(sectiBut);
		sectiBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int prvniCislo = Integer.parseInt(cislo1Field.getText());
				int druheCislo = Integer.parseInt(cislo2Field.getText());
				int vysledek = prvniCislo + druheCislo;
				vysledekLab.setText("Výsledek je: " + vysledek);
			}
		});

		odectiBut = new JButton("-");
		panel2.add(odectiBut);
		odectiBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int prvniCislo = Integer.parseInt(cislo1Field.getText());
				int druheCislo = Integer.parseInt(cislo2Field.getText());
				int vysledek = prvniCislo - druheCislo;
				vysledekLab.setText("výsledek je: " + vysledek);
			}
		});

		vynasobBut = new JButton("*");
		panel2.add(vynasobBut);
		vynasobBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int prvniCislo = Integer.parseInt(cislo1Field.getText());
				int druheCislo = Integer.parseInt(cislo2Field.getText());
				int vysledek = prvniCislo * druheCislo;
				vysledekLab.setText("výsledek je: " + vysledek);
			}
		});

		vydelBut = new JButton("/");
		panel2.add(vydelBut);
		vydelBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int prvniCislo = Integer.parseInt(cislo1Field.getText());
				int druheCislo = Integer.parseInt(cislo2Field.getText());
				int vysledek = prvniCislo / druheCislo;
				vysledekLab.setText("výsledek je: " + vysledek);
			}
		});

		vysledekLab = new JLabel("Výsledek je. ");
		panelVysl.add(vysledekLab);

	}

}
