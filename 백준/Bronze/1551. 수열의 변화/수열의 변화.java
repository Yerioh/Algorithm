import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] strArr = sc.nextLine().split(",");
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                intArr[j] = intArr[j + 1] - intArr[j];
            }
        }
        for (int i = 0; i < n - k; i++) {
            if(i == n - k - 1){
                System.out.print(intArr[i]);
            }
            else {
                System.out.print(intArr[i] + ",");
            }
        }
    }
}