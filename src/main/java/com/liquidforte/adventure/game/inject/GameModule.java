package com.liquidforte.adventure.game.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.liquidforte.adventure.game.api.Game;
import com.liquidforte.adventure.game.api.GameController;
import com.liquidforte.adventure.game.api.GameState;
import com.liquidforte.adventure.game.impl.GameControllerImpl;
import com.liquidforte.adventure.game.impl.GameImpl;
import com.liquidforte.adventure.game.impl.GameStateImpl;

public class GameModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Game.class).to(GameImpl.class).in(Singleton.class);
		bind(GameController.class).to(GameControllerImpl.class);
		bind(GameState.class).to(GameStateImpl.class);
	}
}
