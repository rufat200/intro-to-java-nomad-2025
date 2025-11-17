import java.util.Scanner;

public class Beec1070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        for (int i = X; i < X+12; i++){
            if (i % 2 != 0){
                System.out.println(i
                );
            }
        }
    }
}
