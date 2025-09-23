import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.printf("Perimeter: %.4f%n", Math.PI*2*r);
        System.out.printf("Perimeter: %.4f%n", Math.PI*Math.pow(r, 2));
    }
}
