import java.io.*;

public class Main {
    static int[] stairs;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 계단의 개수
        stairs = new int[N + 1];  // 계단 점수 배열
        dp = new int[N + 1];      // DP 배열: dp[i]는 i번째 계단까지의 최대 점수

        for (int i = 1; i <= N; i++) stairs[i] = Integer.parseInt(br.readLine());

        // 초기 조건 설정
        dp[1] = stairs[1];
        if (N >= 2) {
            dp[2] = stairs[1] + stairs[2];
        }

        // 점화식을 이용해 DP 배열을 채우기
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
        }

        // 마지막 계단에서의 최대 점수를 출력
        System.out.println(dp[N]);
    }
}
