package week1.day2;

public class LearnMethods {
	
	public void browsername()
	{
		System.out.println("Chrome");
	}

	void browserversion (float version)
	{
		System.out.println("Browser Version : " +version);
	}
	
	protected int age(int a, int b)
	{
		return a+b;
	}
	
	private char browserlogo(char c)
	{
		return c;
	}
	
	public String name(int age, String name)
	{
		return name+ " " +  age;
	}
	public static void main (String[] args)
	{
		LearnMethods lm = new LearnMethods();
		lm.age(15, 7);
		System.out.println(lm.age(15, 7));
		System.out.println(lm.browserlogo('c'));
		System.out.println(lm.name(40, "Maha"));
		lm.browserversion(2.15f);
	}
}
	