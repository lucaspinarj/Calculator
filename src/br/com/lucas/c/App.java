package br.com.lucas.c;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import br.com.lucas.c.model.Dsplay;
import br.com.lucas.c.model.Kboard;

@SuppressWarnings("serial")
public class App extends JFrame {

	Dimension sz = new Dimension(232, 321);

	App() {
		setLayout();

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setMaximumSize(sz);
		setMinimumSize(sz);
		setVisible(true);

	}

	void setLayout() {
		setLayout(new BorderLayout());

		Dsplay display = new Dsplay();
		Kboard keyboard = new Kboard();

		add(display, BorderLayout.NORTH);
		add(keyboard, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		new App();
	}

}
