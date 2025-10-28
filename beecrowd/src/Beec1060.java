import java.util.*;
public class Beec1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = Arrays.stream(new double[]{
                sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                sc.nextDouble(), sc.nextDouble(), sc.nextDouble()
        }).filter(x -> x > 0).count();
        System.out.printf("%d valores positivos%n",count);
    }
}
