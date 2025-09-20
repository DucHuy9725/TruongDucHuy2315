package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen315;
    private Date ngaySinh315;
    private String ngheNghiep315;

    public Nguoi() {
    }

    public Nguoi(String hoTen315, Date ngaySinh315, String ngheNghiep315) {
        this.hoTen315 = hoTen315;
        this.ngaySinh315 = ngaySinh315;
        this.ngheNghiep315 = ngheNghiep315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tNhap ho va ten: ");
        hoTen315 = sc315.nextLine();

        System.out.print("\tNhap ngay thang nam sinh (dd/MM/yyyy): ");
        String strDate315 = sc315.nextLine();
        ngaySinh315 = strToDate315(strDate315);

        System.out.print("\tNhap cong viec: ");
        ngheNghiep315 = sc315.nextLine();
    }

    private Date strToDate315(String strDate315) {
        Date date315 = null;
        SimpleDateFormat sdf315 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date315 = sdf315.parse(strDate315);
        } catch (ParseException e315) {
            System.out.println("Khong dung dinh dang ngay thang!");
        }
        return date315;
    }

    public void hienThiThongTin() {
        System.out.println("\tTen: " + hoTen315);
        System.out.println("\tNgay sinh: " + dateToString315(ngaySinh315));
        System.out.println("\tNghe nghiep: " + ngheNghiep315);
    }

    private String dateToString315(Date date315) {
        SimpleDateFormat sdf315 = new SimpleDateFormat("dd/MM/yyyy");
        return sdf315.format(date315);
    }

    public Date getNgaySinh() {
        return ngaySinh315;
    }
}
