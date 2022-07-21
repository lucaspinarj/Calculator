package br.com.lucas.c;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import br.com.lucas.c.model.Dsplay;
import br.com.lucas.c.model.Kboard;

@SuppressWarnings("serial")
public class App extends JFrame {

	App() {
		setLayout();

		Dimension sz = new Dimension(231, 318);
		setMaximumSize(sz);
		setMinimumSize(sz);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	void setLayout() {
		setLayout(new BorderLayout());

		Dsplay display = new Dsplay();
		add(display, BorderLayout.NORTH);

		Kboard keyboard = new Kboard();
		add(keyboard, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new App();
	}
}
