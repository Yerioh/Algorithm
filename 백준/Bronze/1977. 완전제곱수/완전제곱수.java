import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int intSum = 0;
        int minInt = -1;
        for (int i = 0; i <= 100; i++) {
            if(i*i >= m && i*i <= n){
                if(minInt == -1){
                    minInt = i*i;
                }
                intSum += i*i;
            }
        }
        if(intSum != 0) {
            System.out.println(intSum);
        }
        System.out.println(minInt);
    }
}