package com.liquidforte.adventure.player.inject;

import com.google.inject.AbstractModule;
import com.liquidforte.adventure.player.api.Player;
import com.liquidforte.adventure.player.api.PlayerController;
import com.liquidforte.adventure.player.api.PlayerState;
import com.liquidforte.adventure.player.impl.PlayerControllerImpl;
import com.liquidforte.adventure.player.impl.PlayerImpl;
import com.liquidforte.adventure.player.impl.PlayerStateImpl;

public class PlayerModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Player.class).to(PlayerImpl.class);
		bind(PlayerController.class).to(PlayerControllerImpl.class);
		bind(PlayerState.class).to(PlayerStateImpl.class);
	}
}
