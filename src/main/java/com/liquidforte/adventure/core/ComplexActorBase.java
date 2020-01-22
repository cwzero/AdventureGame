package com.liquidforte.adventure.core;

public abstract class ComplexActorBase<C extends Controller, S extends State> extends ActorBase implements ComplexActor<C, S> {
	private C controller;
	private S state;
	
	public ComplexActorBase(C controller, S state) {
		this.controller = controller;
		this.state = state;
	}

	@Override
	public C getController() {
		return controller;
	}

	@Override
	public S getState() {
		return state;
	}
}
