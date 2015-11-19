/**
 * 
 */
package hello;

/**
 * @author LegendKnight
 *
 */
public class hello_HinhThangCan extends hello_HinhChuNhat {
	private int duongCao;
	public static int SO_CANH = 4;

	public hello_HinhThangCan(int dayLon, int dayBe, int cao) {
		super(dayLon, dayBe);
		// TODO Auto-generated constructor stub
		this.setDuongCao(cao);
		
	}

	/**
	 * @return the duongCao
	 */
	public int getDuongCao() {
		return duongCao;
	}

	/**
	 * @param duongCao the duongCao to set
	 */
	public void setDuongCao(int duongCao) {
		this.duongCao = duongCao;
	}

	public void tinhChuVi() {
		int dayLon = getChieuDai();
		int dayBe = getChieuRong();
		float canhday = (float)((dayLon - dayBe))/2;
		int canhben = (int)Math.sqrt(canhday * canhday + duongCao * duongCao);
		this.chuVi = canhben*2 + dayLon + dayBe;
	}
	
	public void tinhDienTich() {
		int dayLon = getChieuDai();
		int dayBe = getChieuRong();
		this.dienTich = ((dayLon + dayBe) * duongCao) / 2;
	}
	
	public static int inSoCanh() {
		System.out.println("HTC So Canh : " + SO_CANH);
		return SO_CANH;
	}
/*
	private void privateHienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("private hienThongTin");
		System.out.println("Day lon : " + getChieuDai()
							+ "\nDay be : " + getChieuRong()
								+ "\nDuong cao : " + this.duongCao
				               		+ "\nChu vi : " + this.chuVi
				               			+ "\nDien tich :" + this.dienTich);				                  
	}
	
	public void publicHienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("public hienThongTin");
		System.out.println("Day lon : " + getChieuDai()
							+ "\nDay be : " + getChieuRong()
								+ "\nDuong cao : " + this.duongCao
									+ "\nChu vi : " + this.chuVi
										+ "\nDien tich :" + this.dienTich);					                  
	}
	
	void hienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("hienThongTin");
		System.out.println("Day lon : " + getChieuDai()
							+ "\nDay be : " + getChieuRong()
								+ "\nDuong cao : " + this.duongCao
									+ "\nChu vi : " + this.chuVi
										+ "\nDien tich :" + this.dienTich);				                  
	}
	
	protected void protectedHienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("protected hienThongTin");
		System.out.println("Day lon : " + getChieuDai()
							+ "\nDay be : " + getChieuRong()
								+ "\nDuong cao : " + this.duongCao
									+ "\nChu vi : " + this.chuVi
										+ "\nDien tich :" + this.dienTich);					                  
	}
*/
}
