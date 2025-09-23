import java.util.Scanner;

public class Beec1006 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("MEDIA = %.1f%n", (s.nextDouble()*2+s.nextDouble()*3+s.nextDouble()*5)/10);
    }
}
