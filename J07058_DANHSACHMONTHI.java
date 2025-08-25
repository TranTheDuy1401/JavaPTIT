import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class MonThi {
    private String maMon, tenMon, hinhThucThi;

    public MonThi(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.hinhThucThi;
    }
}

public class J07058 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int n = in.nextInt();
        in.nextLine();
        MonThi[] arr = new MonThi[n];
        for (int i = 0; i < n; i++) {
            MonThi x = new MonThi(in.nextLine(), in.nextLine(), in.nextLine());
            arr[i] = x;
        }
        Arrays.sort(arr, new Comparator<MonThi>() {

            @Override
            public int compare(MonThi o1, MonThi o2) {
                return o1.getMaMon().compareTo(o2.getMaMon());
            }

        });
        for (MonThi x : arr) {
            System.out.println(x);
        }
    }
}
