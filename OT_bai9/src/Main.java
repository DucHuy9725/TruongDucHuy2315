import java.util.Scanner;
import Class.QuanLy;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);

        QuanLy ql315 = new QuanLy();
        ql315.nhapDanhSach315(sc315);

        System.out.println("\nDanh sach sinh vien phai tra sach vao cuoi thang:");
        ql315.hienThiDanhSachTraCuoiThang315();

        sc315.close();
    }
}
