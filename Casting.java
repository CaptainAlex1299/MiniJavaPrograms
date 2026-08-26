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
		}
	}