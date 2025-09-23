import java.util.Scanner;

public class Beec1005 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(), b = s.nextDouble();
        System.out.printf("MEDIA = %.5f%n", ((a*3.5+b*7.5)/11));
    }
}
