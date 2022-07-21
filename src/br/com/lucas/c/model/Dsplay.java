package br.com.lucas.c.model;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.lucas.c.logic.Memory;
import br.com.lucas.c.logic.observers.MemoryObserver;

@SuppressWarnings("serial")
public class Dsplay extends JPanel implements MemoryObserver {

	private final JLabel label;

	public Dsplay() {
		setBackground(new Color(51, 46, 48));

		Memory.getInstance().addObserver(this);

		// 9 numbers to begin to size down
		// TODO downsize the numbers
		label = new JLabel(Memory.getInstance().getTxt());

		label.setForeground(new Color(232, 231, 231));
		label.setFont(new Font("San Francisco", Font.PLAIN, 35));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 9));
		add(label);

	}

	public void changeValue(String newValue) {
		label.setText(newValue);
	}

}
