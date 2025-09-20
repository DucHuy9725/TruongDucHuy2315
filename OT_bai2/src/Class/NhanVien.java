package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec315;

    public NhanVien() {
    }

    public NhanVien(String hoTen315, String ngaySinh315, String gioiTinh315, String diaChi315, String congViec315) {
        super(hoTen315, ngaySinh315, gioiTinh315, diaChi315);
        this.congViec315 = congViec315;
    }

    public void nhapThongTin315(Scanner sc315) {
        super.nhapThongTin315(sc315);
        System.out.print("\tNhap cong viec: ");
        this.congViec315 = sc315.nextLine();
    }

    public void hienThiThongTin315() {
        super.hienThiThongTin315();
        System.out.println("\tCong viec: " + this.congViec315);
    }
}
