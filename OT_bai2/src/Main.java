import Class.QLCB;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);
        QLCB qlcb315 = new QLCB();

        qlcb315.nhapDanhSach315(sc315);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name315 = sc315.nextLine();
        qlcb315.timKiemCanBo315(name315);

        sc315.close();
    }
}