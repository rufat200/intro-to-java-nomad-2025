public class Problem11 {
    public static void main(String[] args) {
        long current_population = 312032486;
        long seconds_in_year = 60 * 60 * 24 * 365;

        long births_per_year = seconds_in_year / 7;
        long deaths_per_year = seconds_in_year / 13;
        long immigrants_per_year = seconds_in_year / 45;

        long annual_change = births_per_year - deaths_per_year + immigrants_per_year;

        for (int i = 1; i <= 5; i++) {
            current_population += annual_change;
            System.out.println("Население через " + i + " лет: " + current_population);
        }
    }
}
