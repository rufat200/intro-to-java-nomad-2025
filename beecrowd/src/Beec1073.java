import java.util.Scanner;

public class Beec1073 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        short N = s.nextShort();
        for(int i = 1; i<=N;i++){
            if(i % 2 == 0){
                System.out.printf("%d^2 = %d%n",i, i*i);
            }
        }
    }
}
