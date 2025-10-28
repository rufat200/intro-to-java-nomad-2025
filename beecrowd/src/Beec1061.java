import java.util.*;
public class Beec1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение начальных данных
        String[] startDayLine = sc.nextLine().split(" ");
        int startDay = Integer.parseInt(startDayLine[1]);
        String[] startTime = sc.nextLine().split(" : ");
        int startH = Integer.parseInt(startTime[0]);
        int startM = Integer.parseInt(startTime[1]);
        int startS = Integer.parseInt(startTime[2]);

        // Чтение конечных данных
        String[] endDayLine = sc.nextLine().split(" ");
        int endDay = Integer.parseInt(endDayLine[1]);
        String[] endTime = sc.nextLine().split(" : ");
        int endH = Integer.parseInt(endTime[0]);
        int endM = Integer.parseInt(endTime[1]);
        int endS = Integer.parseInt(endTime[2]);

        // Переводим всё в секунды
        int startTotal = startDay * 86400 + startH * 3600 + startM * 60 + startS;
        int endTotal = endDay * 86400 + endH * 3600 + endM * 60 + endS;

        int diff = endTotal - startTotal;

        // Разбиваем разницу обратно
        int days = diff / 86400; diff %= 86400;
        int hours = diff / 3600; diff %= 3600;
        int minutes = diff / 60;
        int seconds = diff % 60;

        System.out.printf("%d dia(s)\n", days);
        System.out.printf("%d hora(s)\n", hours);
        System.out.printf("%d minuto(s)\n", minutes);
        System.out.printf("%d segundo(s)\n", seconds);
    }
}
