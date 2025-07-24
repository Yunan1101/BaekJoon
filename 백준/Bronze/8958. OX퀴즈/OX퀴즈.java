import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scanner.next();
            int count = 0;
            int sum = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                }
                else
                {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}