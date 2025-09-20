package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac315;

    public CongNhan() {
    }

    public CongNhan(String hoTen315, String ngaySinh315, String gioiTinh315, String diaChi315, String bac315) {
        super(hoTen315, ngaySinh315, gioiTinh315, diaChi315);
        this.bac315 = bac315;
    }

    public void nhapThongTin315(Scanner sc315) {
        super.nhapThongTin315(sc315);
        System.out.print("\tNhap bac: ");
        this.bac315 = sc315.nextLine();
    }

    public void hienThiThongTin315() {
        super.hienThiThongTin315();
        System.out.println("\tBac: " + this.bac315);
    }
}
