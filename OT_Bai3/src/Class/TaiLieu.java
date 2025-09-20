package Class;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu315;
    private String tenNXB315;
    private int soBanPhatHanh315;

    public TaiLieu() {}

    public TaiLieu(String maTaiLieu315, String tenNXB315, int soBanPhatHanh315) {
        this.maTaiLieu315 = maTaiLieu315;
        this.tenNXB315 = tenNXB315;
        this.soBanPhatHanh315 = soBanPhatHanh315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tMoi nhap ma tai lieu: ");
        maTaiLieu315 = sc315.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        tenNXB315 = sc315.nextLine();
        System.out.print("\tSo luong ban phat hanh: ");
        soBanPhatHanh315 = sc315.nextInt();
        sc315.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tMa TL: " + maTaiLieu315);
        System.out.println("\tNXB: " + tenNXB315);
        System.out.println("\tSo ban: " + soBanPhatHanh315);
    }

    public String getMaTaiLieu() {
        return maTaiLieu315;
    }
}
