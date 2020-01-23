package com.liquidforte.adventure.player.impl;

import com.google.inject.Inject;
import com.liquidforte.adventure.command.api.CommandEngine;
import com.liquidforte.adventure.core.ControllerBase;
import com.liquidforte.adventure.player.api.PlayerController;
import com.liquidforte.adventure.player.api.PlayerState;

public class PlayerControllerImpl extends ControllerBase<PlayerState> implements PlayerController {
	private CommandEngine commandEngine;
	
	@Inject
	public PlayerControllerImpl(PlayerState state, CommandEngine commandEngine) {
		super(state);
		this.commandEngine = commandEngine;
	}
	
	public CommandEngine getCommandEngine() {
		return commandEngine;
	}

	@Override
	public void run() {
		
	}
}
