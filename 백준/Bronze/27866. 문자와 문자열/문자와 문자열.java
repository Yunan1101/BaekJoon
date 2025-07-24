import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        int n = scanner.nextInt();

        System.out.println(T.charAt(n-1));
    }
}