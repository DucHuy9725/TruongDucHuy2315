package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon315;
    private Date ngayMuon315;
    private Date hanTra315;
    private String soHieu315;

    public TheMuon() {}

    public TheMuon(int soMuon315, Date ngayMuon315, String soHieu315) {
        this.soMuon315 = soMuon315;
        this.ngayMuon315 = ngayMuon315;
        this.soHieu315 = soHieu315;
    }

    public void nhapThongTin(Scanner sc315) {
        super.nhapThongTin(sc315);

        System.out.print("\tNhap so phieu muon: ");
        soMuon315 = sc315.nextInt();
        sc315.nextLine();

        System.out.print("\tNhap ngay muon : ");
        String strNgayMuon315 = sc315.nextLine();
        ngayMuon315 = strToDate315(strNgayMuon315);

        String strNgayTra315 = "30/09/2025";
        hanTra315 = strToDate315(strNgayTra315);

        System.out.print("\tNhap so hieu sach: ");
        soHieu315 = sc315.nextLine();
    }

    private Date strToDate315(String strNgay315) {
        Date date315 = null;
        SimpleDateFormat sdf315 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date315 = sdf315.parse(strNgay315);
        } catch (ParseException e) {
            System.out.println("Ngay nhap khong dung dinh dang!");
        }
        return date315;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phieu: " + soMuon315);
        System.out.println("\tNgay muon: " + ngayMuon315);
        System.out.println("\tHan tra: " + hanTra315);
        System.out.println("\tSo hieu sach: " + soHieu315);
    }

    public Date getHanTra() {
        return hanTra315;
    }
}
