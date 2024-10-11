import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        while (input != null) {
            StringTokenizer st = new StringTokenizer(input);
            int m = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int temp;
            for (int i = 0; i < n; i++) {
                temp = m * e;
                m = p / s;
                p = l / r;
                l = temp;
            }
            System.out.println(m);
            input = br.readLine();
        }

    }
}