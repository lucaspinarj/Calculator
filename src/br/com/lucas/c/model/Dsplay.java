package br.com.lucas.c.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Dsplay extends JPanel {

	private final JLabel label;

	public Dsplay() {
		setPreferredSize(new Dimension(230, 54));
		setBackground(new Color(51, 46, 48));

		// 9 numbers to begin to size down
		label = new JLabel("111111111"); 
		//TODO IMPLEMENT OBSERVER
		//TODO IMPLEMENT DOWNSIZE ABOVE 9 NUMBERS
		label.setForeground(new Color(232, 231, 231));
		label.setFont(new Font("San Francisco", Font.PLAIN, 35));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 9));
		add(label);

	}

}
