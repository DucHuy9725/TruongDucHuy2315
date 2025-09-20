package Class;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen315;
    protected String ngaySinh315;
    protected String queQuan315;

    public Nguoi() {
    }

    public Nguoi(String hoTen315, String ngaySinh315, String queQuan315) {
        this.hoTen315 = hoTen315;
        this.ngaySinh315 = ngaySinh315;
        this.queQuan315 = queQuan315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tNhap ten: ");
        this.hoTen315 = sc315.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        this.ngaySinh315 = sc315.nextLine();
        System.out.print("\tNhap que quan: ");
        this.queQuan315 = sc315.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTen: " + this.hoTen315);
        System.out.println("\tNgay sinh: " + this.ngaySinh315);
        System.out.println("\tQue quan: " + this.queQuan315);
    }
}
