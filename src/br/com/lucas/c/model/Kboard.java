package br.com.lucas.c.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Kboard extends JPanel {

	private final Color GRAY = new Color(101, 97, 98);
	private final Color ORANGE = new Color(255, 158, 11);
	private final Color DGRAY = new Color(71, 66, 68);

	public Kboard() {
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		
		addBtn("AC", DGRAY, c, 0, 0, 2, 1);
		addBtn("±", DGRAY, c, 2, 0, 1, 1);
		addBtn("+", ORANGE, c, 3, 0, 1, 1);

		addBtn("7", GRAY, c, 0, 1, 1, 1);
		addBtn("8", GRAY, c, 1, 1, 1, 1);
		addBtn("9", GRAY, c, 2, 1, 1, 1);
		addBtn("x", ORANGE, c, 3, 1, 1, 1);

		addBtn("4", GRAY, c, 0, 2, 1, 1);
		addBtn("5", GRAY, c, 1, 2, 1, 1);
		addBtn("6", GRAY, c, 2, 2, 1, 1);
		addBtn("-", ORANGE, c, 3, 2, 1, 1);

		addBtn("1", GRAY, c, 0, 3, 1, 1);
		addBtn("2", GRAY, c, 1, 3, 1, 1);
		addBtn("3", GRAY, c, 2, 3, 1, 1);
		addBtn("+", ORANGE, c, 3, 3, 1, 1);

		addBtn("0", GRAY, c, 0, 4, 2, 1);
		addBtn(",", GRAY, c, 2, 4, 1, 1);
		addBtn("=", ORANGE, c, 3, 4, 1, 1);

//		add(new Btn("AC", ETC));
//		add(new Btn("±", ETC));
//		add(new Btn("%", ETC));
//		add(new Btn("÷", OP));
//
//		add(new Btn("7", NUM));
//		add(new Btn("8", NUM));
//		add(new Btn("9", NUM));
//		add(new Btn("x", OP));
//
//		add(new Btn("4", NUM));
//		add(new Btn("5", NUM));
//		add(new Btn("6", NUM));
//		add(new Btn("-", OP));
//
//		add(new Btn("1", NUM));
//		add(new Btn("2", NUM));
//		add(new Btn("3", NUM));
//		add(new Btn("+", OP));
//
//		add(new Btn("0", NUM));
//		add(new Btn("0", NUM));
//		add(new Btn(",", NUM));
//		add(new Btn("=", OP));

	}

	private void addBtn(String txt, Color color,
			GridBagConstraints c,
			int x, int y,
			int wi, int he) {
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = wi;
		c.gridheight = he;
		Btn btn = new Btn(txt, color);
		add(btn, c);
	}

}
