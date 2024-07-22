package week1.day1;

public class OddNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a[]= {1,3,5,7,9};
		int b[]= {4,5,3,7};
		
		for (int i = 0; i <a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i] == b[j])
				{
					System.out.println("Matching Number : " +a[i]);
				}

			}
			
		}
		

	
	}

}
