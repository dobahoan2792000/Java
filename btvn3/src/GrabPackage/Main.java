package GrabPackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		GrabBike grab1 = new GrabBike();
		GrabCar grab2 = new GrabCar();
		System.out.println("Nhap so cuoc chay cua Grab bike :");
		int soCuoc = new Scanner(System.in).nextInt();
		grab1.setSoCuoc(soCuoc);
		System.out.println("Nhap so tien cua Grab bike tren 1 cuoc:");
		double tienMotCuoc = new Scanner(System.in).nextDouble();
		grab1.setTienTrenMotCuoc(tienMotCuoc);
		System.out.println("Luong cua Grab bike :" + grab1.tinhTien());
		System.out.println("Nhap luong cung cua Grab car :");
		double luongCung = new Scanner(System.in).nextDouble();
		grab2.setLuongCung(luongCung);
		System.out.println("Nhap so gio chay cao diem cua Grab car :");
		int caoDiem = new Scanner(System.in).nextInt();
		grab2.setGioCaoDiem(caoDiem);
		System.out.println("Nhap so gio chay thap diem cua Grab car :");
		int thapDiem = new Scanner(System.in).nextInt();
		grab2.setGioThapDiem(thapDiem);
		System.out.println("Luong cua Grab car :" + grab2.tinhTien());
	}
}
