
public class HTMLGreeter extends Greeter {
	private String tagName;
	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
	//Constructor One:
	//greeting (a String): sets greeting on the superclass.
	//Always sets tagName to "h1".

	public HTMLGreeter(String greeting) {
		super(greeting);
		tagName = "h1";
		this.tagName = tagName;
	}
	//Constructor Two:
	//greeting (a String): sets greeting on the superclass.
	//tagName (a String): sets the tagName field.
	//public HTMLGreeter(String greeting) {
	//	super(greeting);
		
	//}

	@Override
	public String greet(String name) {
		return ("<" + tagName + ">" + super.greet(name) + "</" + tagName + ">");
}
}