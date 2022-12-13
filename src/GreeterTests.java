import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {

	@Test
	void testGreeting1() {
	String greeter = ("Guten Tag");
	assertEquals("Guten Tag", greeter);
	}
	
	@Test
	void testGreeting2() {
	String greeter = ("Hey");
	assertEquals("Hey", greeter);
	}
	
	@Test
	void testGreeting3() {
	String greeter = ("Bonjour");
	assertEquals("Bonjour", greeter);
	}
	
	@Test
	void testGreeting4() {
	String greet = ("Hi, Aranda");
	assertEquals("Hi, Aranda", greet);
	}
	@Test
	void testGreeting5() {
		String greet = ("Hello, Nancy");
		assertEquals("Hello, Nancy", greet);
	}

	@Test
	void testSimonGreeter1() {
		SimonGreeter greet = new SimonGreeter("Heyo");
		assertEquals("\"Simon says, \"Heyo, Freddy!\"\"", greet.greet("Freddy"));
	}
	@Test
	void testSimonGreeter2() {
		SimonGreeter greet = new SimonGreeter("What's up");
		assertEquals("\"Simon says, \"What's up, Chuck!\"\"", greet.greet("Chuck"));
	}
	@Test
	void testLoudGreeter1() {
		LoudGreeter greet = new LoudGreeter("Good evening");
		assertEquals("Good evening, Margaret!!", greet.greet("Margaret"));
//	}
//	@Test
//	void testLoudGreeter2() {
//		LoudGreeter greet = new LoudGreeter("Ohhhh hiiiii");
//		assertEquals("!!", greet.greet(""));
	}
	@Test
	void testHTMLGreeter1() {
		HTMLGreeter greet = new HTMLGreeter("Hello");
		assertEquals("<h1>Hello, Martin!</h1>", greet.greet("Martin"));
	}
	@Test
	void testHTMLGreeter2() {
		HTMLGreeter greet = new HTMLGreeter("Hi");
		assertEquals("<h1>Hi, Lauren!</h1>", greet.greet("Lauren"));
	}
	
}
