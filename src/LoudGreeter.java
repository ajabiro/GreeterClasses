
public class LoudGreeter extends Greeter{
	
	public LoudGreeter(String greeting) {
		super(greeting);
		
	}

	private String extra = "!";
	
	
	public void addVolume( ) {
		extra += "!";
	}
	
	@Override
	public String greet(String name) {
		return (super.greet(name) + extra);
	}
}

