package GrabPackage;

public class GrapBike extends Grap{
	private int soCuocXe;
	public GrapBike(String tenLaiXe,int soCuocChay)
	{
		this.soCuocXe = soCuocChay;
		this.ten= tenLaiXe;
	}
	public String loaiXe()
	{
		return "Xe May";
	}
	public void tinhTien()
	{
		this.luong = Configs.LUONG_NHAN_VIEN_THEO_CUOC * this.soCuocXe;
	}
}
