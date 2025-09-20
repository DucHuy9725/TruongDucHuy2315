package Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<CBGV> ds315 = new ArrayList<>(10);

    public QuanLy() {
    }

    public void themCBGV(CBGV canBo315) {
        this.ds315.add(canBo315);
    }

    public void nhapDanhSach(Scanner sc315) {
        System.out.print("Nhap so luong can bo giao vien: ");
        int n315 = sc315.nextInt();
        sc315.nextLine();
        System.out.println("Nhap thong tin tung can bo:");

        for (int i = 0; i < n315; i++) {
            System.out.println("==> Can bo thu " + (i + 1) + ":");
            CBGV canBo315 = new CBGV();
            canBo315.nhapThongTin(sc315);
            this.themCBGV(canBo315);
        }
    }
    public void hienThiDanhSach() {
        for (CBGV cb315 : this.ds315) {
            cb315.hienThiThongTin();
        }
    }
    public void timKiem(double mucLuong315) {
        for (CBGV cb315 : this.ds315) {
            if (cb315.getLuongThucLinh() >= mucLuong315) {
                cb315.hienThiThongTin();
            }
        }
    }
}
