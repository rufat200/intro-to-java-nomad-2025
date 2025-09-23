import java.util.Scanner;

public class Beec1010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] p1 = s.nextLine().split(" ");
        String[] p2 = s.nextLine().split(" ");
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",
                Integer.parseInt(p1[1])*Double.parseDouble(p1[2])+
                        Integer.parseInt(p2[1])*Double.parseDouble(p2[2])
        );
    }
}
