import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String[] arr = sc.nextLine().split(" ");
            int zeroCnt = 0;
            for (int j = 0; j < 4; j++) {
                if (arr[j].equals("0")){
                    zeroCnt += 1;
                }
            }
            switch (zeroCnt){
                case 0: System.out.println('E');
                        break;
                case 1: System.out.println('A');
                    break;
                case 2: System.out.println('B');
                    break;
                case 3: System.out.println('C');
                    break;
                case 4: System.out.println('D');
                    break;
            }
        }
    }
}