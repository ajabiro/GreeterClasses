import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
//		this is the way to do it without user input
//		String greeting = "Hi";
//		String name = "Will";
		
//		Greeter g1 = new Greeter(greeting);
//   	 System.out.println(g1.greet(name));
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Choose a greeting: ");
		String  greeting = scnr.next();
		
		System.out.println("Enter your name: ");
		String name = scnr.next();
 
		
	//1  - create a greeter instance
	Greeter g1 = new Greeter(greeting);
	
	//2 - call the greet method on that instance

	//print out the result
	System.out.println(g1.greet(name));

	
	//EXAMPLE OF OUTPUT
//	Choose a greeting: Hey
//	Enter your name: Jerry Seinfeld
//	How much volume to add? (0 to 10): 2
//	Hey, Jerry Seinfeld!
//	Simon says, "Hey, Jerry Seinfeld!"
//	Hey, Jerry Seinfeld!!!!
//	<h1>Hey, Jerry Seinfeld!</h1>
	

	 LoudGreeter g2 = new LoudGreeter(greeting);
	 SimonGreeter g3 = new SimonGreeter (greeting);
	 HTMLGreeter g4 = new HTMLGreeter(greeting);
	 
	 
//	 scnr.close();
//	 
//	 System.out.println("How much volume would you like to add? (0-10)");
//	Scanner scnr2 = new Scanner(System.in);
//	
//	 
//	
//	 int amountOfVolume = scnr2.nextInt();
//	 for (int i = 0; i < amountOfVolume; i++) {
//	 g2.addVolume();
	
//my way is below
	
//	 int amountOfVolume = 0;
//	

		 System.out.println("How much volume would you like to add? (0-10)");
		  int amountOfVolume = scnr.nextInt();
		  for (int i = 0; i < amountOfVolume; i ++) {
	 	g2.addVolume();
		  }
		
	 System.out.println(g2.greet(name));
	 System.out.println(g3.greet(name));
	 System.out.println(g4.greet(name));
	 

	}
}
