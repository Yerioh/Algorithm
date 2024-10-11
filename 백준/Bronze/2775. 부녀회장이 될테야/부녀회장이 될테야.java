import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[k + 1][n + 1];
            for (int j = 0; j <= n; j++) {
                arr[0][j] = j;
            }
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    arr[j][l] = arr[j - 1][l] + arr[j][l - 1];
                }
            }
            System.out.println(arr[k][n]);
        }
    }
}