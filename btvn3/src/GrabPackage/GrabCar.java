package GrabPackage;

public class GrabCar implements Grab{
	private double luongCung;
	private int gioCaoDiem;
	private int gioThapDiem;
	
	public int getGioCaoDiem() {
		return gioCaoDiem;
	}
	public void setGioCaoDiem(int gioCaoDiem) {
		this.gioCaoDiem = gioCaoDiem;
	}
	public int getGioThapDiem() {
		return gioThapDiem;
	}
	public void setGioThapDiem(int gioThapDiem) {
		this.gioThapDiem = gioThapDiem;
	}
	public double getLuongCung() {
		return luongCung;
	}
	public void setLuongCung(double luongCung) {
		this.luongCung = luongCung;
	}
	public double getChayThem() {
		return 100000*getGioCaoDiem() + 50000* getGioThapDiem();
	}
	
	@Override
	public double tinhTien() {
		
		return getLuongCung() + getChayThem();
	}
	
	
}
