package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 15;
		int count = 0;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		
		if (count == 2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Non Prime");
		}
		
	}

}
