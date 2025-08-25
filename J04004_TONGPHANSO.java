
import java.util.Scanner;

class TongPhanSo {
    private long tu, mau;

    public TongPhanSo() {
    }

    public TongPhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public static TongPhanSo tongPS(TongPhanSo a, TongPhanSo b) {
        TongPhanSo x = new TongPhanSo();
        x.tu = a.tu * b.mau + a.mau * b.tu;
        x.mau = a.mau * b.mau;
        return x;
    }

    public long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public String toString() {
        return this.tu / this.gcd(this.tu, this.mau) + "/" + this.mau / this.gcd(this.tu, this.mau);
    }
}

public class TPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TongPhanSo a = new TongPhanSo(Long.parseLong(sc.next()), Long.parseLong(sc.next()));
        TongPhanSo b = new TongPhanSo(Long.parseLong(sc.next()), Long.parseLong(sc.next()));
        TongPhanSo moi = TongPhanSo.tongPS(a, b);
        System.out.println(moi);
    }
}
