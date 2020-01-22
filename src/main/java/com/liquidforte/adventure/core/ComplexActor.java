package com.liquidforte.adventure.core;

public interface ComplexActor<C extends Controller, S extends State> extends HasController<C>, HasState<S> {

}
