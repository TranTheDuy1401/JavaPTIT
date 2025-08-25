import java.util.Scanner;

class CongNhan {
    private static String id = "NV01";
    private String ten;
    private int luongCoBan, ngayCong;
    private String chucVu;

    public CongNhan() {
    }

    public CongNhan(String ten, int luongCoBan, int ngayCong, String chucVu) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }

    public int luong() {
        return this.luongCoBan * this.ngayCong;
    }

    public int thuong() {
        if (this.ngayCong >= 25)
            return (int) (this.luong() * 0.2);
        else if (this.ngayCong >= 22)
            return (int) (this.luong() * 0.1);
        return 0;
    }

    public int phuCap() {
        if (this.chucVu.equals("GD"))
            return 250000;
        else if (this.chucVu.equals("PGD"))
            return 200000;
        else if (this.chucVu.equals("TP"))
            return 180000;
        return 150000;
    }

    public String toString() {
        return this.id + " " + this.ten + " " + this.luong() + " " + this.thuong() + " " + this.phuCap() + " "
                + (this.luong() + this.thuong() + this.phuCap());
    }
}

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luongCoBan = sc.nextInt();
        int ngayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        CongNhan x = new CongNhan(ten, luongCoBan, ngayCong, chucVu);
        System.out.println(x);
    }
}
