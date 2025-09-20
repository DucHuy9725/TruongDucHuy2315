import java.util.Scanner;
import Class.KhachSan;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);

        KhachSan ks315 = new KhachSan();

        System.out.println("Nhap danh sach khach tro cua khach san:");
        ks315.nhapDanhSach(sc315);

        System.out.print("Nhap so CMND cua khach can tinh tien: ");
        int cmnd315 = sc315.nextInt();

        System.out.println("Tong so tien phai thanh toan la: " + ks315.tinhTien(cmnd315));

        sc315.close();
    }
}
