package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> dsts315;

    public TuyenSinh() {
        dsts315 = new ArrayList<ThiSinh>(10);
    }

    public void themThiSinh(ThiSinh ts315) {
        dsts315.add(ts315);
    }

    public void nhapDanhSach(Scanner sc315) {
        ThiSinh ts315;
        int chon315;

        System.out.print("Nhap tong so thi sinh: ");
        int n315 = sc315.nextInt();
        sc315.nextLine();

        for (int i = 0; i < n315; i++) {
            System.out.print("Chon khoi thi (1-A, 2-B, 3-C): ");
            chon315 = sc315.nextInt();

            switch (chon315) {
                case 1:
                    ts315 = new KhoiA("Toan", "Ly", "Hoa");
                    break;
                case 2:
                    ts315 = new KhoiB("Toan", "Hoa", "Sinh");
                    break;
                case 3:
                    ts315 = new KhoiC("Van", "Su", "Dia");
                    break;
                default:
                    ts315 = new KhoiA("Toan", "Ly", "Hoa");
                    break;
            }

            sc315.nextLine();
            ts315.nhapThongTin(sc315);
            themThiSinh(ts315);
        }
    }

    public void hienThiDanhSach() {
        int n315 = dsts315.size();
        for (int i = 0; i < n315; i++) {
            System.out.println(">>> Thong tin thi sinh thu " + (i + 1) + ":");
            dsts315.get(i).hienThiThongTin();
        }
    }

    public void timKiemThiSinh(int soBaoDanh315) {
        for (ThiSinh ts315 : dsts315) {
            if (ts315.getSoBD() == soBaoDanh315) {
                System.out.println(">>> Da tim thay thi sinh voi SBD " + soBaoDanh315 + ":");
                ts315.hienThiThongTin();
            }
        }
    }
}
