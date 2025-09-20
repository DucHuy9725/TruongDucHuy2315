import Class.QuanLy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);
        QuanLy ql315 = new QuanLy();

        ql315.nhapDanhSach(sc315);

        System.out.println("Danh sach can bo co luong thuc linh tu 8 trieu tro len:");
        ql315.timKiem(8000000.0);

        sc315.close();
    }
}
