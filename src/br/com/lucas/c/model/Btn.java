package br.com.lucas.c.model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Btn extends JButton {

	Btn(String txt, Color color) {
		setText(txt);
		setBackground(color);

		setForeground(Dsplay.TXT);
		setOpaque(true);
		setFont(new Font("San Francisco", Font.PLAIN, 20));
		
		setBorder(BorderFactory.createLineBorder(Dsplay.BG));

	}
}
