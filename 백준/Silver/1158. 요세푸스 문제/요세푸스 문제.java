import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> result = new ArrayList<>();
        int[] selected = new int[n];
        Arrays.fill(selected, 0);
        int cnt = 0;
        int idx = 0;
        while (result.size() < n){
            if (idx == n) idx = 0;
            if (selected[idx] == 0){
                cnt++;
            }
            if (cnt == k) {
                result.add(idx + 1);
                selected[idx] = 1;
                cnt = 0;
            }
            idx++;
        }
        StringBuilder answer = new StringBuilder("<");
        for (int i = 0; i < n; i++) {
            answer.append(result.get(i));
            if (i == n - 1) {
                answer.append(">");
            }
            else {
                answer.append(", ");
            }
        }
        System.out.println(answer);
    }
}