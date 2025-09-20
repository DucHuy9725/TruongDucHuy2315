package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected Date ngaySinh;
    protected String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen315, Date ngaySinh315, String queQuan315) {
        this.hoTen = hoTen315;
        this.ngaySinh = ngaySinh315;
        this.queQuan = queQuan315;
    }

    public void nhapThongTin315(Scanner sc315) {
        System.out.print("\tNhap ho va ten: ");
        hoTen = sc315.nextLine();

        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        String strDate = sc315.nextLine();
        ngaySinh = strToDate315(strDate);

        System.out.print("\tNhap que quan: ");
        queQuan = sc315.nextLine();
    }

    private Date strToDate315(String strDate315) {
        Date date315 = null;
        SimpleDateFormat sdf315 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date315 = sdf315.parse(strDate315);
        } catch (ParseException e) {
            System.out.println("Khong dung dinh dang ngay thang!");
        }
        return date315;
    }

    public void hienThi315() {
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tNgay sinh: " + ngaySinh);
        System.out.println("\tQue quan: " + queQuan);
    }

    public String getQueQuan315() {
        return queQuan;
    }

    public Date getNgaySinh315() {
        return ngaySinh;
    }
}
