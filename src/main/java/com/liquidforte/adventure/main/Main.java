package com.liquidforte.adventure.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.liquidforte.adventure.game.api.Game;
import com.liquidforte.adventure.game.inject.GameModule;
import com.liquidforte.adventure.player.inject.PlayerModule;

public class Main {
	public static void main(final String[] args) {
		/*
		 *
		 * Thematic: Dark, Secretive Modern day, truth hidden
		 *
		 */

		/*
		 * Goals -
		 * 
		 * Reacts to the player
		 * 
		 * Dynamic so that it's replayable
		 * 
		 * Easy to learn but unique
		 * 
		 * Not predictable - even if you know how it works, it's still fun
		 * 
		 * Intelligent - feels like you're playing with people
		 * 
		 * Infinite - you can do anything, anything can happen
		 * 
		 * Hidden secrets - clues integrated with story
		 * 
		 * Storyline - mystery to solve
		 * 
		 * 1. Worlds Collide - something broke the barrier between worlds, causing yours
		 * to collide with another
		 * 
		 * 2. Traveler/Dreamer - You are the unique being of this reality, you can
		 * reach beyond. Your mind pierces the veil between the worlds, and you find
		 * yourself in other worlds when your mind wanders. Reality is tenuous for you,
		 * your connection to the world is fragile.
		 * 
		 * Text based - powerful but intuitive and flexible command system
		 */

		/*
		 * TODO: Conditional generators, composite generators, probabilistic generators
		 * 
		 * TODO: Merging descriptions, reactions, results
		 * 
		 * TODO: Player Control
		 *
		 * TODO: Command Engine
		 *
		 * TODO: Script Engine
		 *
		 * TODO: Dialogue System
		 *
		 * TODO: Story System - Generate descriptions, text, dialogue dynamically. Also
		 * action text Generate the world and events dynamically, but create a nice
		 * description
		 *
		 * TODO: Rumor System (Secrets)
		 *
		 * TODO: Action System How to model a dynamic world, with infinite options - how
		 * to be more than a choose-your-own-adventure Like a physics system for
		 * abstract and social stuff
		 *
		 * TODO: Inventory System
		 *
		 * TODO: Loot System
		 *
		 * TODO: Legacy Item System Items which have living traits, haunted and
		 * intelligent. Some may be sentient and able to take human form
		 *
		 * TODO: Storyline - Diverging paths, Generation of Possible events, tracking
		 * future timelines
		 *
		 * TODO: Event System Storyline needs to be dynamic, events are not random but
		 * more than choose-your-own adventure Can't think of everything, need a model
		 * and system to generate different events for replayability Reactive - player
		 * actions affect the future
		 *
		 * TODO: Destiny System Weighted future events - push toward or away from
		 * certain paths in the future This might be determined in the background,
		 * affects the future of the storyline and of characters Integrate with secrets
		 * - reveal which characters have secrets
		 *
		 * TODO: Factions Like characters, act with intention and have infinite options
		 * But they're factions composed of multiple characters and subgroups Potential
		 * allies and enemies, helpers or big bad
		 *
		 * TODO: Reputation System
		 *
		 * TODO: Goal Orientation System Have the relevant NPCs work toward a goal. How
		 * do we make them able to act dynamically with infinite options? How to make
		 * them realistic i.g. they don't always think of every option Reputation - has
		 * the player helped or hindered them
		 *
		 * TODO: NPC Reaction system
		 *
		 * TODO: Character interaction
		 *
		 * TODO: Monsters? Crisis/Threat - what changed the timeline and made people
		 * start time-traveling?
		 *
		 * TODO: Dungeon equivalent?
		 *
		 * TODO: Magic?
		 *
		 */
		
		Injector injector = Guice.createInjector(new PlayerModule(), new GameModule());
		Game game = injector.getInstance(Game.class);
		game.run();
	}
}
