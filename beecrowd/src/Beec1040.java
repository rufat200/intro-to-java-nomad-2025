import java.util.*;

public class Beec1040 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        double n1 = Double.parseDouble(n[0]), n2 = Double.parseDouble(n[1]),n3 = Double.parseDouble(n[2]),n4 = Double.parseDouble(n[3]);
        double res = (2.0*n1+3.0*n2+4.0*n3+n4)/(10.0);
        double mathFloorMedia = Math.floor(res * 10.0) / 10.0;
        System.out.printf("Media: %.1f%n", mathFloorMedia);
        if(mathFloorMedia >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        if(mathFloorMedia <= 4.9){
            System.out.println("Aluno reprovado.");
        }
        if(res >= 5.0 && res < 7.0){
            System.out.println("Aluno em exame.");
            s.useLocale(Locale.US);
            double exam = s.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exam);
            double finalExam = (mathFloorMedia+exam)/2;
            if(finalExam >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            if(finalExam <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", finalExam);
        }
    }
}
