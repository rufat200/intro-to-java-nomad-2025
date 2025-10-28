import java.util.Scanner;

public class Beec1067 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        short n = s.nextShort();
        for (short i = 1; i <= n; i += 2){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
