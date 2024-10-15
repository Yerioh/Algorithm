import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  // 성의 세로 크기
        int m = Integer.parseInt(st.nextToken());  // 성의 가로 크기
        // 성 정보 2차원 배열 담기
        String[][] castle = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                castle[i][j] = row[j];
            }
        }
        int result = getResult(n, m, castle);
        System.out.println(result);
    }

    private static int getResult(int n, int m, String[][] castle) {
        // 행순회
        int rowCnt = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if (castle[i][j].equals("X")) cnt++;
            }
            if (cnt == 0) rowCnt++;
        }
        // 열순회
        int colCnt = 0;
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (castle[j][i].equals("X")) cnt++;
            }
            if (cnt == 0) colCnt++;
        }
        // 더 큰 값을 담기
        int result = Math.max(rowCnt, colCnt);
        return result;
    }
}
