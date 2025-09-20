import java.util.Scanner;
import Class.KhuPho;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);
        KhuPho qlkp315 = new KhuPho();

        qlkp315.nhapDanhSach(sc315);

        System.out.println("Danh sach cac ho dan co nguoi 80 tuoi:");
        qlkp315.timKiemThongTin();

        sc315.close();
    }
}
