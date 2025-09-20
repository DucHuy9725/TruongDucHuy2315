import java.util.Scanner;
import Class.QLHS;

public class Main {
    public static void main(String[] args) {
        Scanner sc315 = new Scanner(System.in);

        QLHS qlhs315 = new QLHS();
        qlhs315.nhapDanhSach315(sc315);

        System.out.println("\nDanh sach hoc sinh co nam sinh 1985 va que Thai Nguyen:");
        qlhs315.timKiemTheoNamVaQue315(1985, "Thai Nguyen");

        System.out.println("\nDanh sach hoc sinh hoc lop 10A1:");
        qlhs315.timKiemTheoLop315("10A1");

        sc315.close();
    }
}
