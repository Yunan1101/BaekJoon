import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[9];
        for (int i = 0; i < 9; i ++) {
            arr[i] = scanner.nextInt();
        }
        int index = 0;
        int max = arr[0];
        for (int i = 0; i < 9; i ++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}