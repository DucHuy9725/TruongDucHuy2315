package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<BienLai> ds315;

    public QuanLy() {
        ds315 = new ArrayList<BienLai>(10);
    }

    public void themBienLai315(BienLai bienLai315) {
        ds315.add(bienLai315);
    }

    public void nhapDanhSach315(Scanner sc315) {
        BienLai bienLai315;
        System.out.print("Nhap tong so bien lai: ");
        int n315 = sc315.nextInt();
        sc315.nextLine();

        System.out.println("Nhap danh sach bien lai:");
        for (int i315 = 0; i315 < n315; i315++) {
            System.out.println("Nhap thong tin bien lai thu " + (i315 + 1) + ":");
            bienLai315 = new BienLai();
            bienLai315.nhapThongTin(sc315);
            themBienLai315(bienLai315);
        }
    }

    public void hienThiDanhSach315() {
        for (int i315 = 0; i315 < ds315.size(); i315++) {
            System.out.println("Bien lai thu " + (i315 + 1) + ":");
            ds315.get(i315).hienThiThongTin();
            System.out.println();
        }
    }
}
