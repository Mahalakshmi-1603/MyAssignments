package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {17,26,35,43,51,17,16};
		int len = data.length;
		System.out.println("Total length of Array : " +len);
		
		System.out.println(data[len-1]);
		Arrays.sort(data);
		System.out.println("Largest Num : " +data[len-1]);
		
		for (int i = 0; i < data.length; i++) 
		{
			System.out.println(data[i]);
			
		}
		
		for (int i = len-1; i >=0 ; i--) 
		{
			System.out.println("Descending Order : " +data[i]);
		}
		
	}

}
