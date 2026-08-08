public class Bookshelf {
	
	public static String label(String title, String author){
		return """
		Book:
		""" + title + " by " + author;
	}
	
	public static void main(String[] args){
		String book1 = label("BigBook", "John");
		System.out.println(book1);
	}
}