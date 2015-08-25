package command.concrete;

import receiver.Light;
import command.ICommand;

/**
 * As concrete class
 * 
 * @DO The ConcreteCommand defines a binding between the action and the receiver
 * 
 * */
public class LightOffCommand<T> implements ICommand {

	T t;

	public LightOffCommand(T t) {
		this.t = t;
	}

	@Override
	public void execute() {
		if (t instanceof Light) {
			Light light = new Light();
			light.switchOff();
		} else {
			System.out.println("instance class doesnt registered/unrecohnized");
		}
	}

}
