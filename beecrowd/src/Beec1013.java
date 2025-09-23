import java.util.Scanner;

public class Beec1013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        int a = Integer.parseInt(n[0]);
        int b = Integer.parseInt(n[1]);
        int c = Integer.parseInt(n[2]);
        int ab = (a + b + ((a-b)>=0?a-b:-(a-b)))/2;
        System.out.println((ab+c+((ab-c)>=0?ab-c:-(ab-c)))/2 + " eh o maior");
    }
}
