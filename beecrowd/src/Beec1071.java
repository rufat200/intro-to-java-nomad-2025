import java.util.Scanner;

public class Beec1071 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int min = n1>n2?n2:n1;
        int max = n1>n2?n1:n2;
        int res = 0;
        for (int i = min + 1; i < max; i++){
            if (i % 2 != 0) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
