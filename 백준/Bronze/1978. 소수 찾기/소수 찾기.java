import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N =  scanner.nextInt();
        int []arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
