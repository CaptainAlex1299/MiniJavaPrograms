public class CompoundOpperators{
	
	public static void main(String[] args){
		int camel = 2, girafe = 3;
		camel *= girafe;
		// camel = camel * girafe (this does the same thing)
		System.out.println(camel);
		//
		/*
		long goat = 10;
		int sheep = 5;
		sheep = goat * sheep; (this does not compile) we are trying to assign a long value to an int, we can fix this with casting 
		sheep = (int)(sheep * goat);
		or instead we can use compound opperator instead;
		*/
		
		long goat = 10;
		int sheep = 5;
		sheep *= goat;
		System.out.println(sheep);
	}
}