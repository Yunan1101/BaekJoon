import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int [] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < T; i++) {
            if (max > arr[i])
            {
                max = arr[i];
            }
        }
        for (int i = 0; i < T; i++) {
            if (min < arr[i])
            {
                min = arr[i];
            }
        }
        System.out.print(max + " " + min);
    }
}