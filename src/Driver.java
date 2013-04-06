public class Driver {
	public static void main(String[] args) {
		System.out.println("This is fun!");
		System.out.println("I want to check this in!");
		
		// Bad idea, let's bring the object out
		FunObject myObj = new FunObject();
		System.out.println(myObj.getMeTheName());
	}

}
