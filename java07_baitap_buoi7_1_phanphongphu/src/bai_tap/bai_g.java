package bai_tap;
import java.util.Scanner;

public class bai_g {
	public static void main(String[] args) {
		int phanTu;
		Scanner banPhim = new Scanner(System.in);
		do {
			System.out.print("Nhập vào số phần tử: ");
			phanTu = banPhim.nextInt();
			// Số phần tử mảng < 0 => cảnh báo và cho phép nhập lại
			if (phanTu < 0) {
				System.out.println("Số phần tử bên trong mảng không hợp lệ! Vui lòng nhập lại.");
			}
			// Số phần tử mảng = 0 => mảng rỗng, dừng chương trình
			if (phanTu == 0) {
				System.out.print("Mảng rỗng");
				return;
			}
		} while(phanTu < 0);
		
		int[] mangSo = new int[phanTu];
		
		for (int i = 0; i < phanTu; i++) {
			System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
			mangSo[i] = banPhim.nextInt();
		}
		tinhTongSoAm(mangSo);
	}
	public static void tinhTongSoAm(int[] mangSo) {
		int tinhTong= 0;
		for (int i = 0; i < mangSo.length; i++) {
			if (mangSo[i] < 0) {
				tinhTong += mangSo[i];
			}
		}
		System.out.printf("Tổng các số âm là %d", tinhTong);
	}
}