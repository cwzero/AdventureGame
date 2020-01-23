package com.liquidforte.adventure.core;

public interface Controller<S extends State> extends HasState<S>, Runnable {

}
