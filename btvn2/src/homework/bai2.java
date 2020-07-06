package homework;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		double[] arr = {1.549,1.6,1.857,2.34,2.615,2.701};
		int electric;
		do {
			System.out.println("Nhap so dien :");
		 electric = new Scanner(System.in).nextInt();
		} while (electric<0);
		tongTienDien(electric,arr);
	}

	private static void tongTienDien(int electric,double[] arr) {
		double sum = 0;
		if(electric <=50)
		{
			sum+=arr[0]*electric;
		}
		else if(electric <=100)
		{
			sum+=arr[1]*electric;
		}
		else if(electric<=200)
		{
			sum+=arr[2]*electric;
		}
		else if(electric<=300)
		{
			sum+=arr[3]*electric;
		}
		else if(electric<=400)
		{
			sum+=arr[4]*electric;
		}
		else sum+=arr[5]*electric;
		System.out.println("Tong tien :" + sum);
			
		
	}
}
