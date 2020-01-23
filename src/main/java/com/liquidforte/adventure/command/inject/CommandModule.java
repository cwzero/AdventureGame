package com.liquidforte.adventure.command.inject;

import com.google.inject.AbstractModule;
import com.liquidforte.adventure.command.api.CommandEngine;
import com.liquidforte.adventure.command.impl.CommandEngineImpl;

public class CommandModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(CommandEngine.class).to(CommandEngineImpl.class);
	}
}
