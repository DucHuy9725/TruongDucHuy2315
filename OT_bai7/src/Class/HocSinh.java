package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
    private String lop315;
    private String khoaHoc315;
    private String kyHoc315;

    public HocSinh() {
    }

    public HocSinh(String hoTen315, String lop315, String khoaHoc315, String kyHoc315) {
        this.hoTen = hoTen315;
        this.lop315 = lop315;
        this.khoaHoc315 = khoaHoc315;
        this.kyHoc315 = kyHoc315;
    }

    public void nhapThongTin315(Scanner sc315) {
        super.nhapThongTin315(sc315);

        System.out.print("\tNhap ten lop: ");
        lop315 = sc315.nextLine();

        System.out.print("\tNhap khoa hoc: ");
        khoaHoc315 = sc315.nextLine();

        System.out.print("\tNhap ky hoc: ");
        kyHoc315 = sc315.nextLine();
    }

    public void hienThi315() {
        super.hienThi315();
        System.out.println("\tLop: " + lop315);
        System.out.println("\tKhoa hoc: " + khoaHoc315);
        System.out.println("\tKy hoc: " + kyHoc315);
    }

    public String getLop315() {
        return lop315;
    }
}
