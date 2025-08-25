import java.util.Scanner;

class NhanVien {
    private static String id = "00001";
    private String name, genter, birth, address, codeID, dateH;

    public NhanVien(String name, String genter, String birth, String address, String codeID, String dateH) {
        birth = this.chuanHoaNgaySinh(birth);
        dateH = this.chuanHoaNgaySinh(dateH);
        this.name = name;
        this.genter = genter;
        this.birth = birth;
        this.address = address;
        this.codeID = codeID;
        this.dateH = dateH;
    }

    public String chuanHoaNgaySinh(String ns) {
        StringBuilder sb = new StringBuilder(ns);
        if (sb.charAt(2) != '/')
            sb.insert(0, '0');
        if (sb.charAt(5) != '/')
            sb.insert(3, '0');
        return sb.toString();
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.genter + " " + this.birth + " " + this.address + " " + this.codeID
                + " " + this.dateH;
    }
}

public class OOP_NhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                sc.nextLine());
        System.out.println(x);
    }
}
