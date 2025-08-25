import java.util.Scanner;

class SinhVien {
    private static String maSV = "B20DCCN001";
    private String ten, lop, ngaySinh;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String ten, String lop, String ngaySinh, double gpa) {
        ngaySinh = this.chuanHoaNgaySinh(ngaySinh);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String chuanHoaNgaySinh(String ns) {
        StringBuilder sb = new StringBuilder(ns);
        if (sb.charAt(2) != '/')
            sb.insert(0, '0');
        if (sb.charAt(5) != '/')
            sb.insert(3, '0');
        return sb.toString();
    }

    public String toString() {
        return this.maSV + " " + this.ten + " " + this.lop + " " + this.ngaySinh + " "
                + String.format("%.2f", this.gpa);
    }
}

public class OOP_SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien(sc.nextLine(), sc.next(), sc.next(), sc.nextDouble());
        System.out.println(x);
    }
}
