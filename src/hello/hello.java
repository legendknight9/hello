/**
 * 
 */
package hello;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import hinh.hinh_HinhChuNhat;

/**
 * @author LegendKnight
 *
 */
public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception, NullPointerException {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt((double)('y' * 11 * 78)));
		System.exit(0);
		System.out.println("\nhcn");
		hinh_HinhChuNhat hcn = new hinh_HinhChuNhat(5, 2);
		hcn.publicHienThongTin();
		
		System.out.println("\nhcn1");
		hello_HinhChuNhat hcn1 = new hello_HinhChuNhat(5, 2);
		hcn1.protectedHienThongTin();
		hcn1.publicHienThongTin();
		hcn1.hienThongTin();
		
		System.out.println("\nhtc");
		hello_HinhThangCan htc = new hello_HinhThangCan(5, 2, 4);
		htc.publicHienThongTin();
		htc.hienThongTin();
		htc.protectedHienThongTin();
		
		hello_HinhChuNhat.inSoCanh();
		hello_HinhThangCan.inSoCanh();
		
		PrintWriter pw = new PrintWriter(new FileWriter(new File("abc.txt"), false), true);
		pw.println("asfldsldfjlksjaf\nasldkflsdjfa");
		
		Scanner sc = new Scanner(new File("abc.txt"));
		while (sc.hasNextLine()) System.out.println(sc.nextLine());
	}

}

