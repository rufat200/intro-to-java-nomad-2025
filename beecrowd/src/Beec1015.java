import java.util.Scanner;

public class Beec1015 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] n = {s.nextLine().split(" "), s.nextLine().split(" ")};
        double x1 = Double.parseDouble(n[0][0]), x2 = Double.parseDouble(n[1][0]), y1 = Double.parseDouble(n[0][1]), y2 = Double.parseDouble(n[1][1]);
        System.out.printf("%.4f%n",Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1, 2)), 0.5));
    }
}
