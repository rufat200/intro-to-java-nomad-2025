import java.util.*;

public class Beec1038 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        Map<String,Double> CP = new HashMap<String,Double>();
        CP.put("1",4.00);
        CP.put("2",4.50);
        CP.put("3",5.00);
        CP.put("4",2.00);
        CP.put("5",1.50);
        System.out.printf("Total: R$ %.2f%n", CP.get(n[0])*Double.parseDouble(n[1]));
    }
}
