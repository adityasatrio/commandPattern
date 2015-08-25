import command.ICommand;
import command.concrete.LightOffCommand;
import command.concrete.LightOnCommand;
import receiver.Light;
import invoker.RemoteControl;

/**
 * Client Class
 * 
 * @Do The Client creates ConcreteCommands and sets a Receiver for the command
 * 
 * */
public class Client {

	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		
		Light light = new Light();
		
		//prepare the command/request to switch light on
		ICommand requestLightOn = new LightOnCommand(light);
		
		//prepare the command/request to switch light off
		ICommand requestLightOff = new LightOffCommand<Light>(light);
		
		control.setCommand(requestLightOn);
		control.pressButton();
		
		control.setCommand(requestLightOff);
		control.pressButton();
		
		
	}
}
