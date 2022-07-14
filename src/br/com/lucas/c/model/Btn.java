package br.com.lucas.c.model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Btn extends JButton {

	Btn(String txt, Color color) {
		setText(txt);
		setFont(new Font("San Francisco", Font.PLAIN, 15));
		setOpaque(true);
		setBackground(color);
		setForeground(new Color(232, 231, 231));
		setBorder(BorderFactory.createLineBorder(new Color(51, 46, 48)));
	}
}
