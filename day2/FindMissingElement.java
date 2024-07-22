package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,5,7,10,9,8,6};
		int sum1 = 0;
		int sum2 = 0;
		
		
		Arrays.sort(a);//1,2,3,4,6,7,8
		
		for (int i = 0; i < a.length; i++) 
		{
			sum1 = sum1+a[i];
		}
			for (int j = 1; j <= 10; j++) 
			{
				sum2 = sum2+j;
			}
		
		System.out.println(sum1);
		System.out.println(sum2);
		//total = sum2-sum1;
		System.out.println("Missed Number : " +(sum2-sum1));
		
		

	}

}
