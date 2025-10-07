import java.util.Scanner;

public class Beec1041 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        double x = Double.parseDouble(n[0]), y = Double.parseDouble(n[1]);
        if(x>0.0 && y>0.0){
            System.out.println("Q1");
        } else if (x<0.0 && y>0.0) {
            System.out.println("Q2");
        } else if (x<0.0 && y<0.0) {
            System.out.println("Q3");
        } else if (x>0.0 && y<0.0) {
            System.out.println("Q4");
        } else if (x==0.0 && y==0.0) {
            System.out.println("Origem");
        } else if (x!=0.0 && y==0.0) {
            System.out.println("Eixo X");
        } else if (x==0.0 && y!=0.0) {
            System.out.println("Eixo Y");
        }

    }
}
