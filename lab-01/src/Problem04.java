public class Problem04 {
    public static void main(String[] args) {
        System.out.printf("%-5s%-5s%-5s%n", "a", "a^2", "a^3");
        for (int i = 1; i < 5; i++) {
            System.out.printf("%-5d%-5d%-5d%n", i, i*i, i*i*i);
        }
    }
}
