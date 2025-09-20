package Class;

import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo315;
    protected int soNha315;
    protected String maCongTo315;

    public KhachHang() {}

    public KhachHang(String tenChuHo315, int soNha315, String maCongTo315) {
        this.tenChuHo315 = tenChuHo315;
        this.soNha315 = soNha315;
        this.maCongTo315 = maCongTo315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tNhap ten chu ho: ");
        tenChuHo315 = sc315.nextLine();

        System.out.print("\tNhap so nha: ");
        soNha315 = sc315.nextInt();
        sc315.nextLine();

        System.out.print("\tNhap ma cong to: ");
        maCongTo315 = sc315.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tChu ho: " + tenChuHo315);
        System.out.println("\tSo nha: " + soNha315);
        System.out.println("\tMa cong to: " + maCongTo315);
    }
}
