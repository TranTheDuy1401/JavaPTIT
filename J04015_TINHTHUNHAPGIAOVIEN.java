import java.util.Scanner;

class GiaoVien {
    private String maGV, ten;
    private long luongCoBan;

    public GiaoVien() {
    }

    public GiaoVien(String maGV, String ten, long luongCoBan) {
        this.maGV = maGV;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public int getCV() {
        StringBuilder sb = new StringBuilder(this.maGV);
        String cV = sb.substring(0, 2).toString();
        if (cV.equals("HT"))
            return 2000000;
        if (cV.equals("HP"))
            return 900000;
        return 500000;
    }

    public int heSo() {
        StringBuilder sb = new StringBuilder(this.maGV);
        return Integer.parseInt(sb.substring(2).toString());
    }

    public long ThuNhap() {
        return this.luongCoBan * this.heSo() + this.getCV();
    }

    public String toString() {
        return this.maGV + " " + this.ten + " " + this.heSo() + " " + this.getCV() + " " + this.ThuNhap();
    }
}

public class OOP_LuongGV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(x);
    }
}
