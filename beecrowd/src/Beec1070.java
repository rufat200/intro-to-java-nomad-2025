import java.util.Scanner;

public class Beec1070 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n; i <= n+11; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
