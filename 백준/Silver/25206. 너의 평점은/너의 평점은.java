import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] gradeScores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double gradeSum = 0;
        double scoreSum = 0;
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();
            if(grade.equals("P")){
                continue;
            }

            int idx = Arrays.asList(grades).indexOf(grade);
            gradeSum += score * gradeScores[idx];
            scoreSum += score;

        }
        System.out.printf("%.6f", gradeSum / scoreSum);
    }
}