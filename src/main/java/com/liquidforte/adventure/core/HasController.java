package com.liquidforte.adventure.core;

public interface HasController<C extends Controller> extends Actor {
	C getController();
}
