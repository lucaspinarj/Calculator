package br.com.lucas.c.logic.observers;

@FunctionalInterface
public interface MemoryObserver {

	void changeValue(String newValue);
}
