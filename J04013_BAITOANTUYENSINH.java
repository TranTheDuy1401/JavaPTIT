import java.util.Scanner;

class ThiSinh {
    private String khuVuc, ten;
    private double toan, ly, hoa;

    public ThiSinh() {
    }

    public ThiSinh(String khuVuc, String ten, double toan, double ly, double hoa) {
        this.khuVuc = khuVuc;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double diemUuTien() {
        StringBuilder sb = new StringBuilder(this.khuVuc);
        if (sb.substring(2, 3).equals("1"))
            return 0.5;
        else if (sb.substring(2, 3).equals("2"))
            return 1;
        return 2.5;
    }

    public double tongDiem() {
        return this.toan * 2 + this.ly + this.hoa + this.diemUuTien();
    }

    public String ketQua() {
        if (this.tongDiem() >= 24)
            return "TRUNG TUYEN";
        return "TRUOT";
    }

    public String toString() {
        double diem = this.tongDiem() - this.diemUuTien();
        if (diem == (int) diem) {
            if (this.diemUuTien() == 1) {
                return this.khuVuc + " " + this.ten + " " + "1" + " " + (int) diem
                        + " " + this.ketQua();
            }
            return this.khuVuc + " " + this.ten + " " + String.format("%.1f", this.diemUuTien()) + " " + (int) diem
                    + " " + this.ketQua();
        } else {
            if (this.diemUuTien() == 1) {
                return this.khuVuc + " " + this.ten + " " + "1" + " " + String.format("%.1f", diem)
                        + " " + this.ketQua();
            }
            return this.khuVuc + " " + this.ten + " " + String.format("%.1f", this.diemUuTien()) + " "
                    + String.format("%.1f", diem)
                    + " " + this.ketQua();
        }
    }
}

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
}
