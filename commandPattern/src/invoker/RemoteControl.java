package invoker;

import command.ICommand;

/**
 * As invoker class.
 * 
 * @DO The Invoker holds a command and can get the Command to execute a request
 *     by calling the execute method
 * */
public class RemoteControl {

	private ICommand command;

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

}
