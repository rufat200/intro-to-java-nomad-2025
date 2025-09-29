import java.util.Scanner;

public class Beec1035 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        int a = Integer.parseInt(n[0]), b = Integer.parseInt(n[1]), c = Integer.parseInt(n[2]), d = Integer.parseInt(n[3]);
        if ((b>c) && (d>a) && ((c+d) > (a+b)) && (c>=0 || d>=0) && (a%2==0)) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}
