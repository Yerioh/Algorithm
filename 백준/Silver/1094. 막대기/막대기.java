import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (x != 0){
            if ((x & 1) == 1){
                cnt ++;
            }
            x = x >> 1;
        }
        System.out.println(cnt);
    }
}