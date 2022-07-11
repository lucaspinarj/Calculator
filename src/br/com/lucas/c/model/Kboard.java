package br.com.lucas.c.model;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Kboard extends JPanel {

	private final Color NUM = new Color(101, 97, 98);
	private final Color OP = new Color(255, 158, 11);
	private final Color ETC = new Color(71, 66, 68);

	public Kboard() {
		setLayout(new GridLayout(5, 4));

		add(new Btn("C", ETC));
		add(new Btn("±", ETC));
		add(new Btn("%", ETC));
		add(new Btn("÷", OP));

		add(new Btn("7", NUM));
		add(new Btn("8", NUM));
		add(new Btn("9", NUM));
		add(new Btn("x", OP));

		add(new Btn("4", NUM));
		add(new Btn("5", NUM));
		add(new Btn("6", NUM));
		add(new Btn("-", OP));

		add(new Btn("1", NUM));
		add(new Btn("2", NUM));
		add(new Btn("3", NUM));
		add(new Btn("+", OP));

		add(new Btn("0", NUM));
		add(new Btn("0", NUM));
		add(new Btn(",", NUM));
		add(new Btn("=", OP));

	}

}
