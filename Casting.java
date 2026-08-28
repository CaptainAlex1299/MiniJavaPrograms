	public class Casting {
		public static void main(String[] args){
			double number = 6.7;
			int newNumber = (int) number;
			System.out.println(newNumber);
			
			long aboutToBeSmall = 19230134521234115L;
			long bigNumber = 19230134521234113L;
			long smallerNumber = aboutToBeSmall - bigNumber;
			int castedSmallerNumber = (int) smallerNumber;
			System.out.println(bigNumber);
			System.out.println(castedSmallerNumber);
			
			//casting a short cuz java promotes short to int when applying arithmetic opperator
			
			short mouse = 10;
			short hamster = 3;
			short capybara = (short)(mouse * hamster);
			System.out.println(capybara);
			// casting multiple stuff
			short rat = (short)(1 + (mouse * hamster));
			System.out.println(rat);
			// cast int hat to byte
			int hat = 4;
			byte boots = (byte)(2 + hat);
			System.out.println(boots);
		}
	}