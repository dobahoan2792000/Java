package GrabPackage;

import java.util.Scanner;

public class TaiXeGrap {
	public static void main(String[] args) {
		System.out.println("Nhap va so luong tai xe :");
		Scanner sc = new Scanner(System.in);
		int tongTaiXe = Integer.parseInt(sc.nextLine());
		Grap[] mangTaiXe = new Grap[tongTaiXe]; 
		for ( int i = 0 ; i < tongTaiXe ; i++)
		{
			System.out.println("Nhap ten tai xe " + (i+1) + ": ");
			String ten = sc.nextLine();
			System.out.println("La tai xe (1-Grap Car, 2- Grab bike) :");
			int laTaiXe = Integer.parseInt(sc.nextLine());
			if(laTaiXe==1)
			{
				System.out.println("So gio lam them");
				int gioLamThem = Integer.parseInt(sc.nextLine());
				System.out.println("Loai gio lam them(1- Gio cao diem , 2- Gio thap diem)");
				int loaiXe = Integer.parseInt(sc.nextLine());
				GrapCar gc = new GrapCar(ten, gioLamThem, loaiXe);
				mangTaiXe[i]=gc;
			}
			else {
				System.out.println("Nhap so cuoc chay");
				int soCuocChay = Integer.parseInt(sc.nextLine());	
				GrapBike gb = new GrapBike(ten, soCuocChay);
				mangTaiXe[i] = gb;
			}
		}
		System.out.println("KET QUA TINH LUONG\n");
		for(GrabInterface grap : mangTaiXe) // khi implements thi lop ke thua cung nhu lop cha
		{
			grap.tinhTien();
			grap.thongTinXe();
		}
		sc.close();
	}
}
