package Class;

import java.util.Scanner;

public class SinhVien {
    protected String hoTen315;
    protected String maSV315;
    protected String ngaySinh315;
    protected String lop315;

    public SinhVien() {}

    public SinhVien(String hoTen315, String maSV315, String ngaySinh315, String lop315) {
        this.hoTen315 = hoTen315;
        this.maSV315 = maSV315;
        this.ngaySinh315 = ngaySinh315;
        this.lop315 = lop315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tNhap ten sinh vien: ");
        hoTen315 = sc315.nextLine();

        System.out.print("\tNhap ma so SV: ");
        maSV315 = sc315.nextLine();

        System.out.print("\tNhap ngay thang nam sinh: ");
        ngaySinh315 = sc315.nextLine();

        System.out.print("\tNhap lop hoc: ");
        lop315 = sc315.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTen SV: " + hoTen315);
        System.out.println("\tNgay sinh: " + ngaySinh315);
        System.out.println("\tMa SV: " + maSV315);
        System.out.println("\tLop: " + lop315);
    }
}
