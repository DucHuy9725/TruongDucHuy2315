import java.util.Scanner;
import Class.TuyenSinh;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);

        TuyenSinh ds315 = new TuyenSinh();

        System.out.println("=== NHAP DANH SACH THI SINH ===");
        ds315.nhapDanhSach(sc315);

        System.out.println("\n=== DANH SACH DU THI ===");
        ds315.hienThiDanhSach();

        System.out.print("\nNhap so bao danh de tim: ");
        int soBD315 = sc315.nextInt();
        sc315.nextLine();

        ds315.timKiemThiSinh(soBD315);

        sc315.close();
    }
}
