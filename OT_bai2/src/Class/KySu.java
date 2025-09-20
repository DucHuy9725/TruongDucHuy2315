package Class;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao315;

    public KySu() {
    }

    public KySu(String hoTen315, String ngaySinh315, String gioiTinh315, String diaChi315, String nganhDaoTao315) {
        super(hoTen315, ngaySinh315, gioiTinh315, diaChi315);
        this.nganhDaoTao315 = nganhDaoTao315;
    }

    public void nhapThongTin315(Scanner sc315) {
        super.nhapThongTin315(sc315);
        System.out.print("\tNhap nganh dao tao: ");
        this.nganhDaoTao315 = sc315.nextLine();
    }

    public void hienThiThongTin315() {
        super.hienThiThongTin315();
        System.out.println("\tNganh dao tao: " + this.nganhDaoTao315);
    }
}
