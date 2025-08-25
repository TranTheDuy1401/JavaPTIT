import java.util.Scanner;

class Rectange {
    private double width, height;
    private static String color;

    public Rectange() {
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void setColor(String color) {
        Rectange.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String toString() {
        String s = color.toLowerCase();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                str += Character.toUpperCase(s.charAt(i));
            } else
                str += s.charAt(i);
        }
        return String.format("%.0f", this.findPerimeter()) + " " + String.format("%.0f", this.findArea()) + " "
                + str;
    }
}

public class OOP_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange x = new Rectange(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()), sc.next());
        if (x.getHeight() <= 0 || x.getWidth() <= 0) {
            System.out.println("INVALID");
        } else
            System.out.println(x);
    }
}
