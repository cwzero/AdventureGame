package com.liquidforte.adventure.core;

public abstract class ControllerBase<S extends State> implements Controller<S> {
	private S state;

	public ControllerBase(S state) {
		this.state = state;
	}
	
	@Override
	public S getState() {
		return state;
	}
}
