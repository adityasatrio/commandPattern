package command.concrete;

import command.ICommand;

import receiver.Light;

/**
 * As concrete class
 * 
 * @DO The ConcreteCommand defines a binding between the action and the receiver
 * 
 * */
public class LightOnCommand implements ICommand {

	Light light;

	/** you can set parameter as T - any type of object */
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
	}

}
