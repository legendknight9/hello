/**
 * 
 */
package hello;

/**
 * @author LegendKnight
 *
 */
public abstract class XeMay implements Xe{

	public int maSo;
	protected int chieuDai;
	int chieuRong;
	private int tenMa;
	private static int MA_SO;
	private final int MA_SO1 = 111111;
	
	
	public String hienThiTen() {
		return null;		
	}
	
	protected int layChieuDai() {
		return 0;
	}
	
	int layChieuRong() {
		return 0;
	}
	
	private String layTenMa() {
		return null;
	}
	
	abstract void a();
	
	abstract public void chay();
	abstract protected void dung();
	abstract void queoTrai();
}