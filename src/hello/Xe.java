package hello;

public interface Xe extends Runnable{
	int VAN_TOC_TOI_DA = 50;
	
	int chay(int vanToc);
	void dung(int thoiGian);
	void queoTrai(int gocQueo);
	void queoPhai(int gocQueo);
	
	default void bamCoi(int soLan) {
		// Noi dung ham bamCoi
	}
	
	static void thangGap() {
		// Noi dung ham thangGap
	}
	
	interface ThongSoXe {
		void setBienSo(String bienSo);
	}
	
	class thongso {
		int maso;
		
		public thongso() {
			
		}
		
		
	}
}
