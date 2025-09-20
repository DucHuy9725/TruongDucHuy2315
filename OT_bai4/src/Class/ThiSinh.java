package Class;

import java.util.Scanner;

public class ThiSinh {
    private int soBD315;
    private String hoTen315;
    private String diaChi315;
    private String dienUuTien315;

    public ThiSinh() {}

    public ThiSinh(int soBD315, String hoTen315, String diaChi315, String dienUuTien315) {
        this.soBD315 = soBD315;
        this.hoTen315 = hoTen315;
        this.diaChi315 = diaChi315;
        this.dienUuTien315 = dienUuTien315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tNhap so bao danh: ");
        soBD315 = sc315.nextInt();
        sc315.nextLine();
        System.out.print("\tNhap ho ten thi sinh: ");
        hoTen315 = sc315.nextLine();
        System.out.print("\tNhap dia chi cu tru: ");
        diaChi315 = sc315.nextLine();
        System.out.print("\tNhap dien uu tien: ");
        dienUuTien315 = sc315.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tSo bao danh: " + soBD315);
        System.out.println("\tHo ten: " + hoTen315);
        System.out.println("\tDia chi: " + diaChi315);
        System.out.println("\tDien uu tien: " + dienUuTien315);
    }

    public int getSoBD() {
        return soBD315;
    }
}
