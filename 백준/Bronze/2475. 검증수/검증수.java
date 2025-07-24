import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int a1 = a*a;
        int b1 = b*b;
        int c1 = c*c;
        int d1 = d*d;
        int e1 = e*e;

        int sum = a1+b1+c1+d1+e1;
        int result = sum % 10;

        System.out.print(result);

    }
}