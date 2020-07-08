package homework;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		double[] arr = {1.549,1.6,1.857,2.34,2.615,2.701};
		int n;
		do {
			System.out.println("Nhap so ho dan :");
			n = new Scanner(System.in).nextInt();
		} while (n<0);
		int[] arrSoDien = new int[n];
		double sum = 0;
		for(int i = 0 ; i< n ; i++)
		{
			do {
				System.out.println("Nhap so tien dien cua ho dan thu :" + (i+1));
				arrSoDien[i] = new Scanner(System.in).nextInt();
			} while (arrSoDien[i]<0);
			sum+= tongTienDien(arrSoDien[i], arr);
			System.out.println(tongTienDien(arrSoDien[i], arr));
		}
		System.out.println(sum);
	}

	private static double tongTienDien(int electric,double[] arr) {
		double sumE = 0;
		if(electric <=50)
		{
			sumE+=arr[0]*electric;
		}
		else if(electric <=100)
		{
			sumE+=arr[1]*electric;
		}
		else if(electric<=200)
		{
			sumE+=arr[2]*electric;
		}
		else if(electric<=300)
		{
			sumE+=arr[3]*electric;
		}
		else if(electric<=400)
		{
			sumE+=arr[4]*electric;
		}
		return sumE;
			
		
	}
}
