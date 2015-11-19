/**
 * 
 */
package hello;

/**
 * @author LegendKnight
 *
 */
public class hello_HinhChuNhat {
	private int chieuDai;
	int chieuRong;
	protected int chuVi;
	protected int dienTich;
	public static int SO_CANH = 4;
	
	public hello_HinhChuNhat() {
		chieuDai = 0;
		chieuRong = 0;
	}
	
	public hello_HinhChuNhat(int dai, int rong) {
		chieuDai = (dai >= rong) ? dai : rong;
		chieuRong = (rong <= dai) ? rong : dai;
	}

	/**
	 * @return the chieuDai
	 */
	int getChieuDai() {
		return chieuDai;
	}

	/**
	 * @param chieuDai the chieuDai to set
	 */
	void setChieuDai(int chieuDai) {
		if (chieuDai >= this.chieuRong) {
			this.chieuDai = chieuDai;
			tinhChuVi();
			tinhDienTich();
		} else {
			System.out.println("Chieu dai phai lon hon chieu rong (" + this.chieuRong + ").");
		}
	}

	/**
	 * @return the chieuRong
	 */
	public int getChieuRong() {
		return chieuRong;
	}

	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(int chieuRong) {
		if (chieuRong <= this.chieuDai) {
			this.chieuRong = chieuRong;
			tinhChuVi();
			tinhDienTich();
		} else {
			System.out.println("Chieu dai (" + this.chieuDai + ") phai lon hon chieu rong.");
		}
	}

	/**
	 * @return the chuVi
	 */
	public int getChuVi() {
		return chuVi;
	}

	public void tinhChuVi() {
		this.chuVi = (this.chieuDai + this.chieuRong) * 2;
	}

	/**
	 * @return the dienTich
	 */
	public int getDienTich() {
		return dienTich;
	}

	public void tinhDienTich() {
		this.dienTich = this.chieuDai * this.chieuRong;
	}

	public static int inSoCanh() {
		System.out.println("HCN So Canh : " + SO_CANH);
		return SO_CANH;
	}
	
	private void privateHienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("private hienThongTin");
		System.out.println("Chieu dai : " + this.chieuDai 
							+ "\nChieu rong : " + this.chieuRong
				               	+ "\nChu vi : " + this.chuVi
				               		+ "\nDien tich :" + this.dienTich);				                  
	}
	
	public void publicHienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("public hienThongTin");
		System.out.println("Chieu dai : " + this.chieuDai 
							+ "\nChieu rong : " + this.chieuRong
				               	+ "\nChu vi : " + this.chuVi
				               		+ "\nDien tich :" + this.dienTich);				                  
	}
	
	void hienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("hienThongTin");
		System.out.println("Chieu dai : " + this.chieuDai 
							+ "\nChieu rong : " + this.chieuRong
				               	+ "\nChu vi : " + this.chuVi
				               		+ "\nDien tich :" + this.dienTich);				                  
	}
	
	protected void protectedHienThongTin() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("protected hienThongTin");
		System.out.println("Chieu dai : " + this.chieuDai 
							+ "\nChieu rong : " + this.chieuRong
				               	+ "\nChu vi : " + this.chuVi
				               		+ "\nDien tich :" + this.dienTich);				                  
	}
}

