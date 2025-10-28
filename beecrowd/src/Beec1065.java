import java.util.*;

public class Beec1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = Arrays.stream(new int[]{
                sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt()
        }).filter(x -> x%2 == 0).count();
        System.out.printf("%d valores pares%n",count);
    }
}
