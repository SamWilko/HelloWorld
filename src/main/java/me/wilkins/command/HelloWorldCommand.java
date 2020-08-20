package me.wilkins.command;

import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.remain.CompSound;

public class HelloWorldCommand extends SimpleCommand {

	public HelloWorldCommand(){
		super("helloworld|hw");
	}

	@Override
	protected void onCommand() {
		Common.tell(getPlayer(), "&8[&6Robo-Wilko&8] &aHello World!");
		CompSound.SUCCESSFUL_HIT.play(getPlayer());
	}
}
