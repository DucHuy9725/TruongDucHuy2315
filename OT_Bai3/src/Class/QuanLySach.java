package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl315;

    public QuanLySach() {
        dstl315 = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu(TaiLieu tl315) {
        dstl315.add(tl315);
    }

    public void nhapDanhSachTL(Scanner sc315) {
        int chon315;
        String tiepTuc315;
        TaiLieu tl315;

        do {
            System.out.print("Chon loai TL (1-Sach, 2-TapChi, 3-Bao): ");
            chon315 = sc315.nextInt();
            sc315.nextLine();

            switch (chon315) {
                case 1 -> tl315 = new Sach();
                case 2 -> tl315 = new TapChi();
                case 3 -> tl315 = new Bao();
                default -> tl315 = new Sach();
            }

            tl315.nhapThongTin(sc315);
            themTaiLieu(tl315);

            System.out.print("Nhap tiep khong (c/k): ");
            tiepTuc315 = sc315.nextLine();
        } while (tiepTuc315.equals("c"));
    }

    public void timMaTL(String maTL315) {
        for (TaiLieu tl315 : dstl315) {
            if (maTL315.equals(tl315.getMaTaiLieu())) {
                tl315.hienThiThongTin();
            }
        }
    }

    public void timLoaiTL(String loai315) {
        for (TaiLieu tl315 : dstl315) {
            if (loai315.equals("Sach") && (tl315 instanceof Sach)) {
                tl315.hienThiThongTin();
            } else if (loai315.equals("TapChi") && (tl315 instanceof TapChi)) {
                tl315.hienThiThongTin();
            } else if (loai315.equals("Bao") && (tl315 instanceof Bao)) {
                tl315.hienThiThongTin();
            }
        }
    }
}
