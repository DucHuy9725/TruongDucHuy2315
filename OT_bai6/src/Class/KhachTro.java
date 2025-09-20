package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
    private int soNgayTro315;
    private String loaiPhong315;
    private double giaPhong315;

    public KhachTro() {}

    public KhachTro(String hoTen315, int cmnd315, int soNgay315, String loaiPhong315, double giaPhong315) {
        this.hoTen = hoTen315;
        this.CMND = cmnd315;
        this.soNgayTro315 = soNgay315;
        this.loaiPhong315 = loaiPhong315;
        this.giaPhong315 = giaPhong315;
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);

        System.out.print("\tNhap so ngay o: ");
        soNgayTro315 = sc315.nextInt();
        sc315.nextLine();
        System.out.print("\tNhap kieu phong: ");
        loaiPhong315 = sc315.nextLine();
        System.out.print("\tNhap gia phong: ");
        giaPhong315 = sc315.nextDouble();
        sc315.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo ngay o: " + soNgayTro315);
        System.out.println("\tKieu phong: " + loaiPhong315);
        System.out.println("\tGia phong: " + giaPhong315);
    }

    public int getSoNgayTro() {
        return soNgayTro315;
    }

    public double getGiaPhong() {
        return giaPhong315;
    }
}
