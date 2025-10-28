import java.util.Scanner;

public class Beec1072 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        short N = s.nextShort();
        short IN = 0;
        short OUT = 0;
        for (short i = 1; i<=N; i++){
            int X = s.nextInt();
            if (10<=X && X<=20){
                IN++;
            }
            else {
                OUT++;
            }
        }
        System.out.printf("%d in%n%d out%n",IN, OUT);
    }
}
