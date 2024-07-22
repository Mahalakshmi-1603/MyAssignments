package week1.day2;

public class Browser {

	
	public String launchrowser(String browserName)
	{
		return browserName;
		//
		}
	
	public void loadURL()
	{
		System.out.println("Browser launched Successfully");
	}
	
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Browser lb = new Browser();
		System.out.println(lb.launchrowser("Chrome"));
		lb.loadURL();

	}

}
