import java.util.Scanner;

public class Beec1011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("VOLUME = %.3f%n", 3.14159*(4/3.0)*Math.pow(s.nextDouble(), 3));
    }
}
