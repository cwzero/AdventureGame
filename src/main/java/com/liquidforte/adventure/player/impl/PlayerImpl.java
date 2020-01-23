package com.liquidforte.adventure.player.impl;

import com.google.inject.Inject;
import com.liquidforte.adventure.core.ComplexActorBase;
import com.liquidforte.adventure.player.api.Player;
import com.liquidforte.adventure.player.api.PlayerController;
import com.liquidforte.adventure.player.api.PlayerState;

public class PlayerImpl extends ComplexActorBase<PlayerController, PlayerState> implements Player {
	@Inject
	public PlayerImpl(PlayerController controller) {
		super(controller);
	}

	@Override
	public void run() {
		super.run();
		
		
	}
}
