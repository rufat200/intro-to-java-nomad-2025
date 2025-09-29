import java.util.Scanner;

public class Beec1019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.printf("%d:%d:%d%n",n/3600, n%3600/60, n%3600%60);
    }
}
