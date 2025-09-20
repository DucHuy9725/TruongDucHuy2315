package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected Date ngaySinh;
    protected int CMND;

    public Nguoi() {}

    public Nguoi(String hoTen315, Date ngaySinh315, int cmnd315) {
        this.hoTen = hoTen315;
        this.ngaySinh = ngaySinh315;
        this.CMND = cmnd315;
    }

    public void nhapThongTin(Scanner sc315) {
        System.out.print("\tNhap ho ten: ");
        hoTen = sc315.nextLine();
        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        String strDate315 = sc315.nextLine();
        ngaySinh = strToDate315(strDate315);
        System.out.print("\tNhap CMND: ");
        CMND = sc315.nextInt();
    }

    private Date strToDate315(String strDate315) {
        Date date315 = null;
        SimpleDateFormat sdf315 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date315 = sdf315.parse(strDate315);
        } catch (ParseException e315) {
            System.out.println("Loi: Ngay thang khong dung dinh dang!");
        }

        return date315;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tNgay sinh: " + ngaySinh);
        System.out.println("\tCMND: " + CMND);
    }

    public int getCMND() {
        return CMND;
    }
}
