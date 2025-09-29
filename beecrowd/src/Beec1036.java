import java.util.Scanner;

public class Beec1036 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        double a = Double.parseDouble(n[0]), b = Double.parseDouble(n[1]), c = Double.parseDouble(n[2]);
        double dis = Math.pow(b,2)-4*a*c;
        if (dis<0.0 || a == 0.0 ){
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.printf("R1 = %.5f%n", (-b+Math.pow(dis,0.5))/(2*a));
            System.out.printf("R2 = %.5f%n", (-b-Math.pow(dis,0.5))/(2*a));
        }
    }
}
