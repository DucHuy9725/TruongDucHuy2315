package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung315;
    private double thuong315;
    private double phat315;
    private double luongThucLinh315;

    public CBGV() {
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);
        System.out.print("\tNhap muc luong co ban: ");
        this.luongCung315 = sc315.nextDouble();
        sc315.nextLine();
        System.out.print("\tNhap tien thuong: ");
        this.thuong315 = sc315.nextDouble();
        sc315.nextLine();
        System.out.print("\tNhap tien phat: ");
        this.phat315 = sc315.nextDouble();
        sc315.nextLine();
        this.luongThucLinh315 = this.luongCung315 + this.thuong315 - this.phat315;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tLuong co ban: " + this.luongCung315);
        System.out.println("\tTien thuong: " + this.thuong315);
        System.out.println("\tTien phat: " + this.phat315);
        System.out.println("\tLuong thuc linh: " + this.luongThucLinh315);
    }

    public double getLuongThucLinh() {
        return this.luongThucLinh315;
    }
}
