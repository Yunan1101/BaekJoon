import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
        b = sc.nextInt();
        c = sc.nextInt();
        d = b+c;
        arr[i] = d;
        }
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
        }
    }