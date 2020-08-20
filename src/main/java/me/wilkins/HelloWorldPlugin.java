package me.wilkins;

import me.wilkins.command.HelloWorldCommand;
import org.mineacademy.fo.plugin.SimplePlugin;

public class HelloWorldPlugin extends SimplePlugin {

	@Override
	protected void onPluginStart() {

		registerCommand(new HelloWorldCommand());

	}
}
