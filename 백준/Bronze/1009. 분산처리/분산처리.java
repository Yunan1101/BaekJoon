import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = 1;
            for (int j = 1; j <= b; j++) {
                c = c * a % 10;
            }
            if (c==0)
            {
                c = 10;
            }
            System.out.println(c);
        }
    }
}