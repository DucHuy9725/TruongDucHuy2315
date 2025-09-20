
import java.util.Scanner;
import Class.QuanLy;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);

        QuanLy ql315 = new QuanLy();
        ql315.nhapDanhSach315(sc315);

        System.out.println("\nThong tin bien lai cua tat ca cac ho:");
        ql315.hienThiDanhSach315();

        sc315.close();
    }
}
