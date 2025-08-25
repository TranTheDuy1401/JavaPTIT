import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
    private TreeSet<String> x = new TreeSet<>();

    public WordSet(String s) {
        String[] arr = s.split("\\s+");
        for (String i : arr) {
            i = i.toLowerCase();
            this.x.add(i);
        }
    }

    public String union(WordSet se) {
        TreeSet<String> set = new TreeSet<>();
        for (String i : this.x) {
            set.add(i);
        }
        for (String i : se.x) {
            if (this.x.contains(i) == true)
                continue;
            set.add(i);
        }
        String tmp = "";
        for (String i : set) {
            tmp += i + " ";
        }
        return tmp.trim();
    }

    public String intersection(WordSet se) {
        TreeSet<String> set = new TreeSet<>();
        for (String i : se.x) {
            if (this.x.contains(i) == false)
                continue;
            set.add(i);
        }
        String tmp = "";
        for (String i : set) {
            tmp += i + " ";
        }
        return tmp.trim();
    }

}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
