package Class;

import java.util.Scanner;

public class CanBo {
    private String hoTen315;
    private String ngaySinh315;
    private String gioiTinh315;
    private String diaChi315;

    public CanBo() {
    }

    public CanBo(String hoTen315, String ngaySinh315, String gioiTinh315, String diaChi315) {
        this.hoTen315 = hoTen315;
        this.ngaySinh315 = ngaySinh315;
        this.gioiTinh315 = gioiTinh315;
        this.diaChi315 = diaChi315;
    }

    public void nhapThongTin315(Scanner sc315) {
        System.out.print("\tNhap ho ten: ");
        this.hoTen315 = sc315.nextLine();
        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        this.ngaySinh315 = sc315.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        this.gioiTinh315 = sc315.nextLine();
        System.out.print("\tNhap dia chi: ");
        this.diaChi315 = sc315.nextLine();
    }

    public void hienThiThongTin315() {
        System.out.println("\tHo ten: " + this.hoTen315);
        System.out.println("\tNgay sinh: " + this.ngaySinh315);
        System.out.println("\tGioi tinh: " + this.gioiTinh315);
        System.out.println("\tDia chi: " + this.diaChi315);
    }

    public String getHoTen315() {
        return this.hoTen315;
    }
}
