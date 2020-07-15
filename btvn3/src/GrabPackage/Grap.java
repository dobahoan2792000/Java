package GrabPackage;

public class Grap implements GrabInterface{
	protected String ten;
	protected long luong;
	public Grap()
	{
		
	}
	public Grap(String ten, long luong) {
		this.ten = ten;
		this.luong = luong;
	}
	protected String loaiXe()
	{
		// lop con phai ghi den len lop nay
		return "";
	}
	@Override
	public void tinhTien() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void thongTinXe() {
		// TODO Auto-generated method stub	
		System.out.println("Tai xe :" + ten);
		System.out.println("Loai xe :" + loaiXe());
		System.out.println("Tien cuoc :" + luong);
	}
	

}
