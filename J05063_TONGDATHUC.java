import java.util.Scanner;

class DaThuc {
    private String x;

    public DaThuc() {
        this.x = "";
    }

    public DaThuc(String x) {
        this.x = x;
    }

    public DaThuc cong(DaThuc p) {
        DaThuc a = new DaThuc();
        this.x = this.x.replace("+", " ");
        p.x = p.x.replace("+", " ");
        String[] arr1 = this.x.split("\\s+");
        String[] arr2 = p.x.split("\\s+");
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            StringBuilder sb1 = new StringBuilder(arr1[i]), sb2 = new StringBuilder(arr2[j]);
            String hs1 = "", hs2 = "";
            for (int k = 0; k < sb1.length(); k++) {
                if (sb1.charAt(k) == '*')
                    break;
                hs1 += sb1.charAt(k);
            }
            for (int k = 0; k < sb2.length(); k++) {
                if (sb2.charAt(k) == '*')
                    break;
                hs2 += sb2.charAt(k);
            }
            String mu1 = "", mu2 = "";
            for (int k = sb1.length() - 1; k >= 0; k--) {
                if (sb1.charAt(k) == '^')
                    break;
                mu1 = sb1.charAt(k) + mu1;
            }
            for (int k = sb2.length() - 1; k >= 0; k--) {
                if (sb2.charAt(k) == '^')
                    break;
                mu2 = sb2.charAt(k) + mu2;
            }
            if (mu1.equals(mu2) == false) {
                int m1 = Integer.parseInt(mu1), m2 = Integer.parseInt(mu2);
                if (m1 > m2) {
                    a.x += arr1[i] + " ";
                    i++;
                } else {
                    a.x += arr2[j] + " ";
                    j++;
                }
            } else {
                int hs = Integer.parseInt(hs1.trim()) + Integer.parseInt(hs2.trim());
                a.x += hs + "*x^" + mu1 + " ";
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            a.x += arr1[i] + " ";
            i++;
        }
        while (j < arr2.length) {
            a.x += arr2[i] + " ";
            j++;
        }

        return a;
    }

    public String toString() {
        String[] arr = this.x.split("\\s+");
        return String.join(" + ", arr);
    }
}

public class J05063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
    public static void main9984236(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }

}

