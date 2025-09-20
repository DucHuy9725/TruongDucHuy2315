package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh315;

    public Bao() {}

    public Bao(String maTaiLieu315, String tenNXB315, int soBanPhatHanh315, String ngayPhatHanh315) {
        super(maTaiLieu315, tenNXB315, soBanPhatHanh315);
        this.ngayPhatHanh315 = ngayPhatHanh315;
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);
        System.out.print("\tNhap ngay phat hanh (dd/MM/yyyy): ");
        ngayPhatHanh315 = sc315.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgay phat hanh: " + ngayPhatHanh315);
    }
}
