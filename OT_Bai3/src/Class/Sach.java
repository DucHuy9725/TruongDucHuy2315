package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia315;
    private int soTrang315;

    public Sach() {}

    public Sach(String maTaiLieu315, String tenNXB315, int soBanPhatHanh315, String tacGia315, int soTrang315) {
        super(maTaiLieu315, tenNXB315, soBanPhatHanh315);
        this.tacGia315 = tacGia315;
        this.soTrang315 = soTrang315;
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);
        System.out.print("\tNhap ten tac gia: ");
        tacGia315 = sc315.nextLine();
        System.out.print("\tNhap tong so trang: ");
        soTrang315 = sc315.nextInt();
        sc315.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTac gia: " + tacGia315);
        System.out.println("\tSo trang: " + soTrang315);
    }
}
