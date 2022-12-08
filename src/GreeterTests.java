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
}
