package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//What --> 0 1 1 2 3 5 8 13
		//Requirements --> int a=0; b=1; c=a+b;
		
		int n1 = 0;
		int n2 = 1;
		int sum;
		System.out.print(n1+ " ");
		System.out.print(n2+ " ");
		
		for (int i = 0; i < 10; i++) 
		{
			sum = n1+n2;
			System.out.print(" "+sum);
			
			n1=n2;
			n2=sum;
			
		}
		
	}

}
