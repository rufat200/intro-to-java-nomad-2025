import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beec1052 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String,String> month = new HashMap<String,String>();
        month.put("1","January");
        month.put("2","February");
        month.put("3","March");
        month.put("4","April");
        month.put("5","May");
        month.put("6","June");
        month.put("7","July");
        month.put("8","August");
        month.put("9","September");
        month.put("10","October");
        month.put("11","November");
        month.put("12","December");
        System.out.println(month.get(s.nextLine()));
    }
}
