import java.util.Scanner;

public class Beec1044 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble(), n2 = s.nextDouble();
        if(n1 > n2){
            if (n1%n2 == 0){
                System.out.println("Sao Multiplos");
            }
            else {
                System.out.println("Nao sao Multiplos");
            }
        }
        else{
            if (n2%n1 == 0){
                System.out.println("Sao Multiplos");
            }
            else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
