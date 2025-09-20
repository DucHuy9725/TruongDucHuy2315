package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi315;
    private int chiSoCu315;
    private double tien315;

    public BienLai() {}

    public BienLai(int chiSoMoi315, int chiSoCu315, double tien315) {
        this.chiSoMoi315 = chiSoMoi315;
        this.chiSoCu315 = chiSoCu315;
        this.tien315 = tien315;
    }

    public BienLai(String tenChuHo315, int chiSoMoi315, int chiSoCu315, double tien315) {
        this.tenChuHo315 = tenChuHo315;
        this.chiSoMoi315 = chiSoMoi315;
        this.chiSoCu315 = chiSoCu315;
        this.tien315 = tien315;
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);

        System.out.print("\tNhap chi so moi: ");
        chiSoMoi315 = sc315.nextInt();
        sc315.nextLine();

        System.out.print("\tNhap chi so cu: ");
        chiSoCu315 = sc315.nextInt();
        sc315.nextLine();

        tien315 = (chiSoMoi315 - chiSoCu315) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChi so moi: " + chiSoMoi315);
        System.out.println("\tChi so cu: " + chiSoCu315);
        System.out.println("\tTien phai tra: " + tien315);
    }
}
