package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> dshd315;

    public KhuPho() {
        dshd315 = new ArrayList<HoDan>(10);
    }

    public void themHoDan(HoDan hoDan315) {
        dshd315.add(hoDan315);
    }

    public void nhapDanhSach(Scanner sc315) {
        System.out.print("Nhap tong so ho dan: ");
        int soHoDan315 = sc315.nextInt();
        sc315.nextLine();

        System.out.println("Nhap thong tin cho tung ho dan:");
        for (int i315 = 0; i315 < soHoDan315; i315++) {
            System.out.println("Ho dan thu " + (i315 + 1) + ":");
            HoDan hoDan315 = new HoDan();
            hoDan315.nhapThongTin(sc315);
            themHoDan(hoDan315);
        }
    }

    public void hienThiDanhSach() {
        int n315 = dshd315.size();
        for (int i315 = 0; i315 < n315; i315++) {
            System.out.println("Ho dan thu " + (i315 + 1) + ":");
            dshd315.get(i315).hienThiThongTin();
        }
    }

    public void timKiemThongTin() {
        Date now315 = new Date();
        int namHienTai315 = now315.getYear() + 1900;

        for (HoDan hoDan315 : dshd315) {
            Nguoi[] dstv315 = hoDan315.getList();
            for (int i315 = 0; i315 < hoDan315.getSoNguoi(); i315++) {
                if (namHienTai315 - (dstv315[i315].getNgaySinh().getYear() + 1900) == 80) {
                    hoDan315.hienThiThongTin();
                }
            }
        }
    }
}
