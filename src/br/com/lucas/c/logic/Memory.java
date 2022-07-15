package br.com.lucas.c.logic;

import java.util.ArrayList;
import java.util.List;

import br.com.lucas.c.logic.observers.MemoryObserver;

public class Memory {

	private static final Memory instance = new Memory();
	private final List<MemoryObserver> observers = new ArrayList<>();

	private Command lastOperation = null;
	private boolean substitute = false;;
	private String txt = "";
	private String txtBuffer = "";

	private Memory() {
	}

	public static Memory getInstance() {
		return instance;
	}

	public void addObserver(MemoryObserver observer) {
		observers.add(observer);
	}

	public String getTxt() {
		return txt.isEmpty() ? "0" : txt;
	}

	private Command detectCommand(String text) {
		if (txt.isEmpty() && text == "0") {
			return null;
		}

		try {
			Integer.parseInt(text);
			return Command.NUMBER;
		} catch (NumberFormatException e) {

			if ("AC".equals(text)) {
				return Command.ERASE;
			} else if ("÷".equals(text)) {
				return Command.DIVIDE;
			} else if ("×".equals(text)) {
				return Command.MULTILPY;
			} else if ("-".equals(text)) {
				return Command.MINUS;
			} else if ("+".equals(text)) {
				return Command.PLUS;
			} else if (",".equals(text) && !txt.contains(",")) {
				return Command.COMMA;
			} else if ("=".equals(text)) {
				return Command.EQUAL;
			} else if ("±".equals(text)) {
				return Command.SIGN;
			}
		}
		return null;
	}

	public void processCommand(String text) {
		Command command = detectCommand(text);

		if (command == null) {
			return;
		} else if (command == Command.ERASE) {
			txt = "";
			txtBuffer = "";
			substitute = false;
			lastOperation = null;
		} else if (command == Command.SIGN && txt.contains("-")) {
			txt = txt.substring(1);
		} else if (command == Command.SIGN && !txt.contains("-")) {
			if (txt == null || txt == "") {
				return;
			} else {
				txt = "-" + txt;
			}
		} else if (command == Command.NUMBER || command == Command.COMMA) {
			if (command == Command.COMMA && (txt == null || txt == "")) {
				return;
			}
			txt = substitute ? text : txt + text;
			substitute = false;
		} else {
			substitute = true;
			txt = result();
			txtBuffer = txt;
			lastOperation = command;
		}
		observers.forEach(o -> o.changeValue(getTxt()));
	}

	private String result() {
		if (lastOperation == null || lastOperation == Command.EQUAL) {
			return txt;
		}

		double numBuffer = Double.parseDouble(txtBuffer.replace(",", "."));
		double num = Double.parseDouble(txt.replace(",", "."));

		double result = 0;

		if (lastOperation == Command.PLUS) {
			result = numBuffer + num;
		} else if (lastOperation == Command.MINUS) {
			result = numBuffer - num;
		} else if (lastOperation == Command.MULTILPY) {
			result = numBuffer * num;
		} else if (lastOperation == Command.DIVIDE) {
			result = numBuffer / num;
		}

		String stringResult = Double.toString(result).replace(".", ",");
		boolean number = stringResult.endsWith(",0");
		return number ? stringResult.replace(",0", "") : stringResult;
	}

}
