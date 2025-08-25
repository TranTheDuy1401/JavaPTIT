import java.util.Scanner;

class Matrix {
    private int[][] a;

    public Matrix() {
    }

    public Matrix(int n, int m) {
        this.a = new int[n][m];
    }

    public int getGrow() {
        return this.a.length;
    }

    public int getGrewth() {
        return this.a[0].length;
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < this.getGrow(); i++) {
            for (int j = 0; j < this.getGrewth(); j++) {
                this.a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix trans() {
        Matrix x = new Matrix(this.getGrewth(), this.getGrow());
        for (int i = 0; i < this.getGrow(); i++) {
            for (int j = 0; j < this.getGrewth(); j++) {
                x.a[j][i] = this.a[i][j];
            }
        }
        return x;
    }

    public Matrix mul(Matrix p) {
        Matrix x = new Matrix(this.getGrow(), p.getGrewth());
        for (int i = 0; i < this.getGrow(); i++) {
            for (int j = 0; j < p.getGrewth(); j++) {
                for (int k = 0; k < this.getGrewth(); k++) {
                    x.a[i][j] += this.a[i][k] * p.a[k][j];
                }
            }
        }
        return x;
    }

    public String toString() {
        String ans = "";
        for (int i = 0; i < this.getGrow(); i++) {
            String tmp = "";
            for (int j = 0; j < this.getGrewth(); j++) {
                tmp += a[i][j] + " ";
            }
            tmp = tmp.trim() + "\n";
            ans += tmp;
        }
        return ans.trim();
    }
}

public class J04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
