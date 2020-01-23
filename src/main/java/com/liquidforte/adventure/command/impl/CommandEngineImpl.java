package com.liquidforte.adventure.command.impl;

import java.io.IOException;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import com.liquidforte.adventure.command.api.CommandEngine;

public class CommandEngineImpl implements CommandEngine {
	private TerminalBuilder terminalBuilder;

	public CommandEngineImpl() {
		terminalBuilder = TerminalBuilder.builder();
	}

	public Terminal loadTerminal() {
		Terminal terminal = null;
		try {
			terminal = terminalBuilder.build();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return terminal;
	}

	@Override
	public void run() {
		try (Terminal terminal = loadTerminal()) {
			LineReader lineReader = LineReaderBuilder.builder().terminal(terminal).build();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
