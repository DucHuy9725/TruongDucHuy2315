package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String mon1315;
    private String mon2315;
    private String mon3315;

    public KhoiA() {}

    public KhoiA(String mon1315, String mon2315, String mon3315) {
        this.mon1315 = mon1315;
        this.mon2315 = mon2315;
        this.mon3315 = mon3315;
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);
        System.out.print("\tNhap mon thu nhat: ");
        mon1315 = sc315.nextLine();
        System.out.print("\tNhap mon thu hai: ");
        mon2315 = sc315.nextLine();
        System.out.print("\tNhap mon thu ba: ");
        mon3315 = sc315.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon: " + mon1315 + " - " + mon2315 + " - " + mon3315);
    }
}
