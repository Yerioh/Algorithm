import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 4 * (n - 1) + 1;
        char[][] array;
        array = new char[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                array[i][j] = ' ';
            }
        }
        for (int i = 0; i < n; i += 2) {
            int len = n - i;
            for (int j = i; j < len; j++){
                array[i][j] = '*';
                array[len - 1][j] = '*';
                array[j][i] = '*';
                array[j][len - 1] = '*';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}