import java.util.Scanner;

public class Beec1043 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble(), n2 = s.nextDouble(), n3 = s.nextDouble();
        if((n1+n2)>n3 && (n1+n3)>n2 && (n2+n3)>n1){
            System.out.printf("Perimetro = %.1f%n", n1+n2+n3);
        }
        else {
            System.out.printf("Area = %.1f%n", (n1+n2)/2*n3);
        }
    }
}
