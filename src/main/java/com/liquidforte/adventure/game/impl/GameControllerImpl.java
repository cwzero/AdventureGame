package com.liquidforte.adventure.game.impl;

import com.google.inject.Inject;
import com.liquidforte.adventure.command.api.CommandEngine;
import com.liquidforte.adventure.core.ControllerBase;
import com.liquidforte.adventure.game.api.GameController;
import com.liquidforte.adventure.game.api.GameState;

public class GameControllerImpl extends ControllerBase<GameState> implements GameController {
	private CommandEngine commandEngine;
	
	@Inject
	public GameControllerImpl(GameState state, CommandEngine commandEngine) {
		super(state);
		this.commandEngine = commandEngine;
	}
	
	public CommandEngine getCommandEngine() {
		return commandEngine;
	}

	@Override
	public void run() {
		getCommandEngine().run();
	}
}
