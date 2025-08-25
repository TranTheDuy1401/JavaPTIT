import java.util.Scanner;

class ThiSinh {
    private String ten, ngaySinh;
    private double diem1, diem2, diem3;

    public ThiSinh(String ten, String ngaySinh, double diem1, double diem2, double diem3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String toString() {
        return this.ten + " " + this.ngaySinh + " " + String.format("%.1f", this.diem1 + this.diem2 + this.diem3);
    }
}

public class OOP_ThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh x = new ThiSinh(sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
}
