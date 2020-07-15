package GrabPackage;

public class GrapCar extends Grap{
	public int gioChayThem;
	public int loaiXe;
	public GrapCar(String tenTaiXe,int gioChayThem, int loaiXe) {
		this.ten = tenTaiXe;
		this.gioChayThem = gioChayThem;
		this.loaiXe = loaiXe;
	}
	public String loaiXe()
	{
		if(this.loaiXe==Configs.XE_FORD)
			return "O to Ford gio cao diem" + (gioChayThem > 0 ? "(Co lam them gio)" : "(Khong lam them gio)");
		else 
			return "O to Kia gio cao diem" + (gioChayThem > 0 ? "(Co lam them gio)" : "(Khong lam them gio)");

	}
	public void tinhTien()
	{
		if(this.loaiXe==Configs.XE_FORD)
		{
			luong = Configs.LUONG_NHAN_VIEN_XE_FORD + 
					(gioChayThem * Configs.LUONG_LAM_THEM_MOT_GIO);
		}
		else {
			luong = Configs.LUONG_NHAN_VIEN_XE_KIA + 
					(gioChayThem * Configs.LUONG_LAM_THEM_MOT_GIO);
		}
	}
	
}	
