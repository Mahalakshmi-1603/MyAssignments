package week1.day2;

import java.util.Arrays;

public class PrintDuplicateValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {19,43,25,56,19,25,100};
		
		//Nested For Loop
		//outer loop
		for (int i = 0; i < values.length; i++) 
		{
			//inner loop 
			for (int j = i+1; j < values.length; j++) 
			{
				if(values[i] == values[j])
				System.out.println("Duplicate : " +values[j]);
			}
		}
		
		
		int[] age= {12,13,14,54,12,45,13,53};
		
		Arrays.sort(age);
		
		for (int i = 0; i < age.length-1; i++) 
		{
			if(age[i] == age[i+1])
			{
				System.out.println("Duplicate with Sort : " +age[i+1]);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
