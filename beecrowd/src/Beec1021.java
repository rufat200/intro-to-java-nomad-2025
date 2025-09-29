import java.util.Scanner;

public class Beec1021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(java.util.Locale.US);
        double d = s.nextDouble();
        int i = (int) d;
        d = (d - i) * 100;
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n",i/100);
        i %= 100;
        System.out.printf("%d nota(s) de R$ 50.00%n",i/50);
        i %= 50;
        System.out.printf("%d nota(s) de R$ 20.00%n",i/20);
        i %= 20;
        System.out.printf("%d nota(s) de R$ 10.00%n",i/10);
        i %= 10;
        System.out.printf("%d nota(s) de R$ 5.00%n",i/5);
        i %= 5;
        System.out.printf("%d nota(s) de R$ 2.00%n",i/2);
        System.out.println("MOEDAS");
        System.out.printf("%d moeda(s) de R$ 1,00%n",i%2);
        i = (int) d;
        System.out.printf("%d moeda(s) de R$ 0.50%n",i/50);
        i %= 50;
        System.out.printf("%d moeda(s) de R$ 0.25%n",i/25);
        i %= 25;
        System.out.printf("%d moeda(s) de R$ 0.10%n",i/10);
        i %= 10;
        System.out.printf("%d moeda(s) de R$ 0.05%n",i/5);
        System.out.printf("%d moeda(s) de R$ 0.01%n",i%5);
    }
}
