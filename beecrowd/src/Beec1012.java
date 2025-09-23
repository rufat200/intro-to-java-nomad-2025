import java.util.Scanner;

public class Beec1012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        System.out.printf("TRIANGULO: %.3f%n",
                Double.parseDouble(n[0])*Double.parseDouble(n[2])*0.5
        );
        System.out.printf("CIRCULO: %.3f%n",
                Math.pow(Double.parseDouble(n[2]),2)*3.14159
        );
        System.out.printf("TRAPEZIO: %.3f%n",
                (Double.parseDouble(n[0])+Double.parseDouble(n[1]))/2*Double.parseDouble(n[2])
        );
        System.out.printf("QUADRADO: %.3f%n",
                Math.pow(Double.parseDouble(n[1]), 2)
        );
        System.out.printf("RETANGULO: %.3f%n",
                Double.parseDouble(n[0])*Double.parseDouble(n[1])
        );
    }
}
