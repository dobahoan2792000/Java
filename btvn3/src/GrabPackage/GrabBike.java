package GrabPackage;

public class GrabBike implements Grab{
	private int soCuoc;
	private double tienTrenMotCuoc;
	public int getSoCuoc() {
		return soCuoc;
	}
	public void setSoCuoc(int soCuoc) {
		this.soCuoc = soCuoc;
	}
	public double getTienTrenMotCuoc() {
		return tienTrenMotCuoc;
	}
	public void setTienTrenMotCuoc(double tienTrenMotCuoc) {
		this.tienTrenMotCuoc = tienTrenMotCuoc;
	}
	@Override
	public double tinhTien() {
		return getTienTrenMotCuoc()*getSoCuoc();
	}

}
