import java.util.Scanner;

class PhanSo {
    private long tu, mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static PhanSo tinhC(PhanSo a, PhanSo b) {
        PhanSo c = new PhanSo();
        c.tu = (long) Math.pow(a.tu * b.mau + b.tu * a.mau, 2);
        c.mau = (long) Math.pow(a.mau * b.mau, 2);
        long pos = PhanSo.gcd(c.tu, c.mau);
        c.tu = c.tu / pos;
        c.mau = c.mau / pos;
        return c;
    }

    public static PhanSo tinhD(PhanSo a, PhanSo b, PhanSo c) {
        PhanSo d = new PhanSo();
        d.tu = a.tu * b.tu * c.tu;
        d.mau = a.mau * b.mau * c.mau;
        long pos = PhanSo.gcd(d.tu, d.mau);
        d.tu = d.tu / pos;
        d.mau = d.mau / pos;
        return d;
    }

    public String toString() {
        return this.tu + "/" + this.mau;
    }
}

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = PhanSo.tinhC(a, b);
            PhanSo d = PhanSo.tinhD(a, b, c);
            System.out.print(c + " ");
            System.out.println(d);
        }
    }
}
