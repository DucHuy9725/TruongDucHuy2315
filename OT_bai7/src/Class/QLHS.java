package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HocSinh> dsHocSinh315;

    public QLHS() {
        dsHocSinh315 = new ArrayList<HocSinh>(10);
    }

    public void themHocSinh315(HocSinh hs315) {
        dsHocSinh315.add(hs315);
    }

    public void nhapDanhSach315(Scanner sc315) {
        HocSinh hs315;

        System.out.print("Nhap tong so hoc sinh: ");
        int n315 = sc315.nextInt();
        sc315.nextLine();

        System.out.println("Bat dau nhap thong tin tung hoc sinh:");
        for (int i = 0; i < n315; i++) {
            System.out.println("\tHoc sinh thu " + (i + 1) + ":");

            hs315 = new HocSinh();
            hs315.nhapThongTin315(sc315);

            themHocSinh315(hs315);
        }
    }

    public void hienThiDanhSach315() {
        int n315 = dsHocSinh315.size();
        for (int i = 0; i < n315; i++) {
            System.out.println("\tHoc sinh so " + (i + 1) + ":");
            dsHocSinh315.get(i).hienThi315();
        }
    }

    public void timKiemTheoNamVaQue315(int nam315, String que315) {
        for (HocSinh hs315 : dsHocSinh315) {
            if ((hs315.getNgaySinh315().getYear() + 1900 == nam315) && (que315.equals(hs315.getQueQuan315()))) {
                hs315.hienThi315();
            }
        }
    }

    public void timKiemTheoLop315(String lop315) {
        for (HocSinh hs315 : dsHocSinh315) {
            if (lop315.equals(hs315.getLop315())) {
                hs315.hienThi315();
            }
        }
    }
}
