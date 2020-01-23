package com.liquidforte.adventure.core;

public interface ComplexActor<C extends Controller<S>, S extends State> extends HasController<C, S>, Runnable {
	
}
