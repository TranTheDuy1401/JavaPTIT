import java.util.Scanner;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public boolean solveSoNguyenTo(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return a > 1;
    }

    public boolean isPrime() {
        if (solveSoNguyenTo(Integer.parseInt(key.toString())) && solveSoNguyenTo(Integer.parseInt(value.toString()))) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.key + " " + this.value;
    }
}

public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
