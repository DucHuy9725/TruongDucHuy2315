package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> ds315;

    public KhachSan() {
        ds315 = new ArrayList<KhachTro>(10);
    }

    public void themKhachTro315(KhachTro kt315) {
        ds315.add(kt315);
    }

    public void nhapDanhSach(Scanner sc315) {
        System.out.print("Nhap so luong khach tro: ");
        int n315 = sc315.nextInt();
        sc315.nextLine();

        System.out.println("Tien hanh nhap thong tin cho tung khach:");
        for (int i315 = 0; i315 < n315; i315++) {
            System.out.println("Khach thu " + (i315 + 1) + ":");
            KhachTro khach315 = new KhachTro();
            khach315.nhapThongTin(sc315);
            themKhachTro315(khach315);
        }
    }

    public void hienThiDanhSach315() {
        for (KhachTro khach315 : ds315) {
            khach315.hienThiThongTin();
        }
    }

    public double tinhTien(int cmnd315) {
        double tien315 = 0;
        for (KhachTro khach315 : ds315) {
            if (khach315.getCMND() == cmnd315) {
                tien315 = khach315.getSoNgayTro() * khach315.getGiaPhong();
            }
        }
        return tien315;
    }
}
