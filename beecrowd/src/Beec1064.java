import java.util.Locale;
import java.util.Scanner;

public class Beec1064 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        int count = 0;
        double res = 0;
        for (int i = 0; i < 6; i++) {
            double n = s.nextDouble();
            if (n > 0) {
                count++;
                res += n;
            }
        }
        System.out.printf("%d valores positivos%n", count);
        System.out.printf("%.1f%n", res/count);
    }
}
