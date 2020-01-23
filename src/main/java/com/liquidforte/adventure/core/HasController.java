package com.liquidforte.adventure.core;

public interface HasController<C extends Controller<S>, S extends State> extends HasState<S>, Runnable {
	C getController();
	
	@Override
	default S getState() {
		return getController().getState();
	}
	
	@Override
	default void run() {
		getController().run();
	}
}
