package com.liquidforte.adventure.game.impl;

import com.google.inject.Inject;
import com.liquidforte.adventure.core.ComplexActorBase;
import com.liquidforte.adventure.game.api.Game;
import com.liquidforte.adventure.game.api.GameController;
import com.liquidforte.adventure.game.api.GameState;
import com.liquidforte.adventure.player.api.Player;

public class GameImpl extends ComplexActorBase<GameController, GameState> implements Game {
	private Player player;

	@Inject
	public GameImpl(GameController controller, Player player) {
		super(controller);
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}

	@Override
	public void run() {
		while(true) {
			doRun();
		}
	}
	
	protected void doRun() {
		super.run();
		
		getPlayer().run();		
	}
}
