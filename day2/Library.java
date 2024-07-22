package week1.day2;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	
	void issueBook()
	{
		System.out.println("Book Issued Successfully");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library li = new Library();
		li.addBook(null);
		li.issueBook();
	

	}

}
