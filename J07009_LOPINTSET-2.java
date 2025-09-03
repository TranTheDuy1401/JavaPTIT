import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
    private TreeSet<Integer> x = new TreeSet<>();

    public IntSet() {
    }

    public IntSet(int a[]) {
        for (int i = 0; i < a.length; i++) {
            this.x.add(a[i]);
        }
    }

    public IntSet union(IntSet y) {
        IntSet z = new IntSet();
        for (int i : this.x) {
            z.x.add(i);
        }
        for (int i : y.x) {
            if (z.x.contains(i) == true)
                continue;
            z.x.add(i);
        }
        return z;
    }

    public IntSet intersection(IntSet se) {
        IntSet set = new IntSet();
        for (int i : se.x) {
            if (this.x.contains(i) == false)
                continue;
            set.x.add(i);
        }
        return set;
    }

    public String toString() {
        String tmp = "";
        for (int i : this.x) {
            tmp += i + " ";
        }
        return tmp.trim();
    }
}

public class J07009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }

}

