import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            int j = T * i;
            System.out.println(T + " * " + i + " = " + j);
        }
    }
}