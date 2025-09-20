package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soNguoi315;
    private int soNha315;
    private Nguoi[] list315;

    public HoDan() {
        list315 = new Nguoi[10];
    }

    public HoDan(String hoTen315, Date ngaySinh315, String ngheNghiep315, int soNguoi315, int soNha315) {
        super(hoTen315, ngaySinh315, ngheNghiep315);
        this.soNguoi315 = soNguoi315;
        this.soNha315 = soNha315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tNhap so nguoi trong ho: ");
        soNguoi315 = sc315.nextInt();
        sc315.nextLine();

        System.out.print("\tNhap so nha: ");
        soNha315 = sc315.nextInt();
        sc315.nextLine();

        System.out.println("\tNhap du lieu tung thanh vien:");
        for (int i315 = 0; i315 < soNguoi315; i315++) {
            System.out.println("Thanh vien thu " + (i315 + 1) + ":");
            list315[i315] = new Nguoi();
            list315[i315].nhapThongTin(sc315);
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tTong so nguoi: " + soNguoi315);
        System.out.println("\tSo nha: " + soNha315);
        System.out.println("\tChi tiet tung thanh vien:");
        for (int i315 = 0; i315 < soNguoi315; i315++) {
            System.out.println("Thanh vien thu " + (i315 + 1) + ":");
            list315[i315].hienThiThongTin();
        }
    }

    public Nguoi[] getList() {
        return list315;
    }

    public int getSoNguoi() {
        return soNguoi315;
    }
}
