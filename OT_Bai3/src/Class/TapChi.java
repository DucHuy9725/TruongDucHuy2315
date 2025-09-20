package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh315;
    private int thangPhatHanh315;

    public TapChi() {}

    public TapChi(String maTaiLieu315, String tenNXB315, int soBanPhatHanh315, int soPhatHanh315, int thangPhatHanh315) {
        super(maTaiLieu315, tenNXB315, soBanPhatHanh315);
        this.soPhatHanh315 = soPhatHanh315;
        this.thangPhatHanh315 = thangPhatHanh315;
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);
        System.out.print("\tNhap so phat hanh: ");
        soPhatHanh315 = sc315.nextInt();
        System.out.print("\tNhap thang phat hanh: ");
        thangPhatHanh315 = sc315.nextInt();
        sc315.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phat hanh: " + soPhatHanh315);
        System.out.println("\tThang phat hanh: " + thangPhatHanh315);
    }
}
