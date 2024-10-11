import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String rows = "ABCDEFGH";
        String[] king = st.nextToken().split("");
        String[] stone = st.nextToken().split("");
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            int[] move = new int[2];
            switch (temp) {
                case "R": move[0] = 1;
                          break;
                case "L": move[0] = -1;
                          break;
                case "B": move[1] = -1;
                          break;
                case "T": move[1] = 1;
                          break;
                case "RT": move[0] = 1;
                           move[1] = 1;
                           break;
                case "LT": move[0] = -1;
                           move[1] = 1;
                           break;
                case "RB": move[0] = 1;
                           move[1] = -1;
                           break;
                case "LB": move[0] = -1;
                           move[1] = -1;
                           break;
            }
            int movedRow = rows.indexOf(king[0]) + move[0];
            int movedCol = Integer.parseInt(king[1]) + move[1];
            if ( isValid(movedRow, movedCol)) {
                String[] tempKing = {String.valueOf(rows.charAt(movedRow)), String.valueOf(movedCol)};
                movedRow = rows.indexOf(stone[0]) + move[0];
                movedCol = Integer.parseInt(stone[1]) + move[1];
                if (Arrays.equals(tempKing, stone)){
                    if (isValid(movedRow, movedCol)) {
                        stone[0] = String.valueOf(rows.charAt(movedRow));
                        stone[1] = String.valueOf(movedCol);
                        king = tempKing;
                    }
                }
                else {
                    king = tempKing;
                }

            }
        }
        StringBuilder resultKing = new StringBuilder();
        StringBuilder resultStone = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            resultKing.append(king[i]);
            resultStone.append(stone[i]);
        }
        System.out.println(resultKing);
        System.out.println(resultStone);
    }
    public static boolean isValid(int row, int col) {
        return 0 <= row && row <= 7 && 1 <= col && col <= 8;
    }
}