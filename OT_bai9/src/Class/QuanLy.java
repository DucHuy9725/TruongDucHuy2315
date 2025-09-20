package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds315;

    public QuanLy() {
        ds315 = new ArrayList<TheMuon>(10);
    }

    public void themTheMuon315(TheMuon theMuon315) {
        ds315.add(theMuon315);
    }

    public void nhapDanhSach315(Scanner sc315) {
        TheMuon theMuon315;

        System.out.print("Nhap tong so the muon: ");
        int n315 = sc315.nextInt();
        sc315.nextLine();

        System.out.println("Bat dau nhap danh sach:");
        for (int i315 = 0; i315 < n315; i315++) {
            System.out.println("Nhap thong tin the muon thu " + (i315 + 1) + ":");
            theMuon315 = new TheMuon();
            theMuon315.nhapThongTin(sc315);
            themTheMuon315(theMuon315);
        }
    }

    public void hienThiDanhSachTraCuoiThang315() {
        for (TheMuon the315 : ds315) {
            if (the315.getHanTra().getDate() == 31 || the315.getHanTra().getDate() == 30) {
                the315.hienThiThongTin();
            }
        }
    }
}
