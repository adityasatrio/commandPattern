package command;

/**
 * Command interface class
 * 
 * @Do Command declares an interface for all commands, providing a simple
 *     execute() method which asks the Receiver of the command to carry out an
 *     operation
 * 
 * */
public interface ICommand {

	void execute();

}
