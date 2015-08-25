package receiver;

/**
 * As receiver class (operation)
 * 
 * @DO : The Receiver has the knowledge of what to do to carry out the request.
 * 
 * */
public class Light {

	private boolean lightSwitch;

	public void switchOn() {
		lightSwitch = Boolean.TRUE;
		System.out.println("Light Switch turned ON");
	}

	public void switchOff() {
		lightSwitch = Boolean.FALSE;
		System.out.println("Light Switch turned OFF");
	}

}
