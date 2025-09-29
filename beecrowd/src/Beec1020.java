import java.util.Scanner;

public class Beec1020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.printf("%d ano(s)%n", n/365);
        n %= 365;
        System.out.printf("%d mes(es)%n",n/30);
        System.out.printf("%d dia(s)%n", n%30);
    }
}
