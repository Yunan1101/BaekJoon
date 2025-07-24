import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        String str = Integer.toString(A) + Integer.toString(B);

        int result1 = A+B-C;
        int result2 = Integer.parseInt(str) - C;

        System.out.println(result1);
        System.out.println(result2);
    }
}