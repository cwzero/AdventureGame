package com.liquidforte.adventure.core;

public interface HasState<S extends State> extends Actor {
	S getState();
}
