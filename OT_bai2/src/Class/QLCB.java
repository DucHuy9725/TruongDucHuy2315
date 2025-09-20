package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSach315 = new ArrayList<>(10);

    public QLCB() {
    }

    public void themCanBo315(CanBo cb315) {
        this.danhSach315.add(cb315);
    }

    public void nhapDanhSach315(Scanner sc315) {
        System.out.print("Nhap vao so luong can bo: ");
        int soLuong315 = Integer.parseInt(sc315.nextLine());

        sc315.nextLine();
        System.out.println("Nhap thong tin chi tiet:");

        for (int i = 0; i < soLuong315; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ":");
            System.out.print("Chon can bo (1-KySu; 2-NhanVien; 3-CongNhan): ");
            int chon315 = sc315.nextInt();
            sc315.nextLine();
            CanBo cb315;
            switch (chon315) {
                case 1:
                    cb315 = new KySu();
                    break;
                case 2:
                    cb315 = new NhanVien();
                    break;
                case 3:
                    cb315 = new CongNhan();
                    break;
                default:
                    cb315 = new KySu();
            }

            cb315.nhapThongTin315(sc315);
            this.themCanBo315(cb315);
        }
    }

    public void timKiemCanBo315(String hoTen315) {
        for (CanBo cb315 : this.danhSach315) {
            if (hoTen315.equals(cb315.getHoTen315())) {
                cb315.hienThiThongTin315();
            }
        }
    }
}
