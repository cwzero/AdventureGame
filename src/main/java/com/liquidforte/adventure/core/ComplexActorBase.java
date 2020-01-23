package com.liquidforte.adventure.core;

public abstract class ComplexActorBase<C extends Controller<S>, S extends State> extends ActorBase implements ComplexActor<C, S> {
	private C controller;
	
	public ComplexActorBase(C controller) {
		this.controller = controller;
	}

	@Override
	public C getController() {
		return controller;
	}
}
