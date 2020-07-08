package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class bai1 {
	public static void main(String[] args) {
		int[] arr = {90,90,20,27,35,22,10,8,8};
		addNumber(100,arr,2);
		deleteSameNumer(arr);
	}

	private static void deleteSameNumer(int[] arr) {
		int count = 1;
		int start = 0;
		for(int i = 0 ;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1]) count++;
		}
		int[] arrCopy = new int[count];
		for(int i = 0 ; i<arr.length;i++)
		{
			int flag = i+1;
			for(int j = i+1 ; j<arr.length;j++)
			{
				if(arr[i]!=arr[j]) flag++;	
				
			}
			if(flag==arr.length)
			{
				arrCopy[start]= arr[i];
				start++;
			}
		}
		System.out.println(Arrays.toString(arrCopy));
		
	}

	private static void addNumber(int number,int[] arr,int k) {
		int[] arrCopy = new int[arr.length+1];
		for(int i = 0 ; i< arr.length ; i++)
		{
			arrCopy[i] = arr[i];
		}
		for ( int j = arrCopy.length-1 ; j>k ; j--)
		{
			arrCopy[j] = arrCopy[j-1];
		}
		arrCopy[k] = number;
		
		System.out.println(Arrays.toString(arrCopy));
	}
}
