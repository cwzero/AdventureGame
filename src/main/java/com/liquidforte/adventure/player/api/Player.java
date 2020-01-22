package com.liquidforte.adventure.player.api;

import com.liquidforte.adventure.action.ActionSource;
import com.liquidforte.adventure.core.ComplexActor;

public interface Player extends ComplexActor<PlayerController, PlayerState>, ActionSource {

}
