import java.util.Scanner;

class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
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

public class OOP_PHANSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(Long.parseLong(sc.next()), Long.parseLong(sc.next()));
        System.out.println(x);
    }
}
