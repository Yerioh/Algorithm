import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            br.readLine();
            int student = Integer.parseInt(br.readLine());
            BigInteger candySum = BigInteger.ZERO;
            for (int j = 0; j < student; j++) {
                BigInteger candy = new BigInteger(br.readLine());
                candySum = candySum.add(candy);
            }
            if (candySum.mod(BigInteger.valueOf(student)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            };
        }
    }
}