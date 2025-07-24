import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int mul = a * b * c;
        String str = Integer.toString(mul);


        int[] count = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            count[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}