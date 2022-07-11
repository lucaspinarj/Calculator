package br.com.lucas.c.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Dsplay extends JPanel {

	static final Color BG = new Color(51, 46, 48);
	static final Color TXT = new Color(232, 231, 231);

	private final JLabel label;

	public Dsplay() {
		setPreferredSize(new Dimension(232, 53));
		setBackground(BG);

		// 9 numbers to begin to size down
		label = new JLabel("111111111");
		label.setForeground(TXT);
		label.setFont(new Font("San Francisco", Font.PLAIN, 35));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		add(label);

	}

}
